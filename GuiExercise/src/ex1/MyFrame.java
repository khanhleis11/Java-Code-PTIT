package ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    private JPanel panel1, panel2;
    private JButton btn;
    private JComboBox<String> comboBox;
    private Font customFont = new Font("Arial", Font.PLAIN, 16);
    
    public MyFrame(String title) throws HeadlessException{
        super(title);
        panel1 = new JPanel();
        panel2 = new JPanel();
        btn = new JButton("Change Color");
        btn.setFont(customFont);
        comboBox = new JComboBox<>();
        comboBox.setFont(customFont);
        
        
        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.CENTER);
        panel2.setLayout(new FlowLayout());
        panel2.add(btn);
        panel2.setFont(customFont);
        comboBox.addItem("Red");
        comboBox.addItem("Green");
        comboBox.addItem("Black");
        comboBox.addItem("Yellow");
        comboBox.addItem("Blue");
        comboBox.addItem("Pink");
        panel2.add(comboBox);
        this.add(panel2, BorderLayout.SOUTH);
        
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = comboBox.getSelectedItem().toString();
                if (color.equals("Red")) {
                    panel1.setBackground(Color.red);
                }
                if (color.equals("Green")) {
                    panel1.setBackground(Color.green);
                }
                if (color.equals("Black")) {
                    panel1.setBackground(Color.black);
                }
                if (color.equals("Yellow")) {
                    panel1.setBackground(Color.yellow);
                }
                if (color.equals("Blue")) {
                    panel1.setBackground(Color.blue);
                }
                if (color.equals("Pink")) {
                    panel1.setBackground(Color.pink);
                }
            }
            
        });
        
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//        this.setLayout(null);
        this.setVisible(true);
    }
}
