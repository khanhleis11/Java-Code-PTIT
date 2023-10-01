package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        
//        Label area
        JLabel lbl1 = new JLabel("First number");
        lbl1.setBounds(30, 30, 100, 30);
        frame.add(lbl1);
        
        JLabel lbl2 = new JLabel("Second number");
        lbl2.setBounds(30, 70, 100, 30);
        frame.add(lbl2);
        
        JLabel lbl3 = new JLabel("Result");
        lbl3.setBounds(30, 110, 100, 30);
        frame.add(lbl3);
        
//        TextField
        JTextField text1 = new JTextField();
        text1.setBounds(170, 30, 220, 30);
        frame.add(text1);
        
        JTextField text2 = new JTextField();
        text2.setBounds(170, 70, 220, 30);
        frame.add(text2);
        
        JTextField text3 = new JTextField();
        text3.setBounds(170, 110, 220, 30);
        frame.add(text3);
        
        JButton clr = new JButton("CLEAR");
        clr.setBounds(30, 150, 80, 30);
        frame.add(clr);
        
        JButton addBtn = new JButton("ADD");
        addBtn.setBounds(30, 190, 70, 30);
        frame.add(addBtn);
        
        JButton subBtn = new JButton("SUB");
        subBtn.setBounds(125, 190, 70, 30);
        frame.add(subBtn);
        
        JButton mulBtn = new JButton("MUL");
        mulBtn.setBounds(220, 190, 70, 30);
        frame.add(mulBtn);
        
        JButton divBtn = new JButton("DIV");
        divBtn.setBounds(315, 190, 70, 30);
        frame.add(divBtn);
        
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
                text3.setText("");
            }
            
        });
        
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                text3.setText("" + (a + b));
            }    
        });
        
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                text3.setText("" + (a - b));
            }
        });
        
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                text3.setText("" + (a  *b));
            }
        });
        
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                text3.setText("" + (double)a / b);
            }
        });
        
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
