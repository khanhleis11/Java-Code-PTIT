package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Calculator extends JFrame implements ActionListener {
    private static JTextField displayScreen;

    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");

    private JButton buttonPlus = new JButton("+");
    private JButton buttonMinus = new JButton("-");
    private JButton buttonDivide = new JButton("/");
    private JButton buttonMultiply = new JButton("*");
    private JButton buttonClear = new JButton("C");
    private JButton buttonSqr = new JButton("Sqrt");
    private JButton buttonEquals = new JButton("=");
    private JButton buttonPow = new JButton("^");

    public Calculator() {
        super("Calculator");

        displayScreen = new JTextField(" ");
        displayScreen.setPreferredSize(new Dimension(280, 60));
        displayScreen.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        JPanel r1 = new JPanel();
        JPanel r2 = new JPanel();
        JPanel r3 = new JPanel();
        JPanel r4 = new JPanel();
        JPanel r5 = new JPanel();
        JPanel r6 = new JPanel();

        r1.setLayout(new FlowLayout());
        r2.setLayout(new FlowLayout());
        r3.setLayout(new FlowLayout());
        r4.setLayout(new FlowLayout());
        r5.setLayout(new FlowLayout());
        r6.setLayout(new FlowLayout());

        // Add buttons to the panels
        r1.add(displayScreen);
        r2.add(button1);
        r2.add(button2);
        r2.add(button3);
        r2.add(buttonPlus);

        r3.add(button4);
        r3.add(button5);
        r3.add(button6);
        r3.add(buttonMinus);

        r4.add(button7);
        r4.add(button8);
        r4.add(button9);
        r4.add(buttonMultiply);

        r5.add(button0);
        r5.add(buttonSqr);
        r5.add(buttonPow);
        r5.add(buttonDivide);

        r6.add(buttonClear);
        r6.add(buttonEquals);

        // Set action listeners for the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonPow.addActionListener(this);
        buttonSqr.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);

        // Set fonts for buttons
        Font customFont = new Font("Arial", Font.PLAIN, 16);
        displayScreen.setFont(customFont);
        JButton[] buttons = { button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonPlus, buttonMinus, buttonDivide, buttonMultiply, buttonPow, buttonSqr, buttonEquals};
        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(65, 65));
            button.setFont(customFont);
        }
        buttonClear.setFont(customFont);
        buttonClear.setPreferredSize(new Dimension(205, 65));
        
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        panel.add(r6);
        this.add(panel);

        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonClear)
            displayScreen.setText("");
        else if (e.getSource() == buttonEquals)
            displayScreen.setText(calculate(displayScreen.getText()));
        else if (e.getSource() == buttonSqr) {
            try {
                double result = Math.sqrt(Integer.parseInt(displayScreen.getText().trim()));
                if (String.valueOf(result).equals("NaN"))
                    displayScreen.setText("Math error!");
                else
                    displayScreen.setText(String.valueOf(result));
            } catch (Exception ex) {
                displayScreen.setText("Math error!");
            }
        } else if (e.getSource() == buttonPow)
            displayScreen.setText(displayScreen.getText() + "^");
        else
            displayScreen.setText(displayScreen.getText() + e.getActionCommand());
    }

    private int degree(char c) {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        return 0;
    }

    private double calc(double a, double b, char c) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '^') {
            return Math.pow(a, b);
        }
        return a / b;
    }

    private String calculate(String s) {
        try {
            Stack<Double> num = new Stack<>();
            Stack<Character> op = new Stack<>();
            int i = 0;

            num.push(0.0);

            while (i < s.length()) {
                if (Character.isDigit(s.charAt(i))) {
                    double val = 0;
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        val = val * 10 + (s.charAt(i) - '0');
                        i++;
                    }
                    num.push(val);
                } else {
                    while (!op.isEmpty() && degree(op.peek()) >= degree(s.charAt(i))) {
                        double val2 = num.pop();
                        double val1 = num.pop();
                        char top = op.pop();
                        num.push(calc(val1, val2, top));
                    }
                    op.push(s.charAt(i));
                    i++;
                }
            }

            while (!op.isEmpty()) {
                double val2 = num.pop();
                double val1 = num.pop();
                char top = op.pop();
                num.push(calc(val1, val2, top));
            }

            double result = num.peek();

            if (result == (long) result) {
                return String.valueOf((long) result);
            } else {
                return String.valueOf(result);
            }
        } catch (Exception e) {
            return "Math error!";
        }
    }
}
