package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Exchange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exchange Rate");
        
        JLabel lbl1 = new JLabel("VND");
        lbl1.setBounds(30, 30, 50, 30);
        frame.add(lbl1);
        
        JTextField text1 = new JTextField();
        text1.setBounds(100, 30, 250, 30);
        frame.add(text1);
        
        JLabel lbl2 = new JLabel("USD");
        lbl2.setBounds(30, 100, 50, 30);
        frame.add(lbl2);
        
        JTextField text2 = new JTextField();
        text2.setBounds(100, 100, 250, 30);
        frame.add(text2);
        
        JLabel lbl3 = new JLabel("Rate");
        lbl3.setBounds(30, 170, 50, 30);
        frame.add(lbl3);
        
        JTextField text3 = new JTextField();
        text3.setBounds(100, 170, 250, 30);
        frame.add(text3);
        
        JButton btn1 = new JButton("VND to USD");
        btn1.setBounds(50, 240, 110, 30);
        frame.add(btn1);
        
        JButton btn2 = new JButton("USD to VND");
        btn2.setBounds(250, 240, 110, 30);
        frame.add(btn2);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(text1.getText());
                double y = Double.parseDouble(text3.getText());
                text2.setText("" + (x / y));
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(text2.getText());
                double y = Double.parseDouble(text3.getText());
                text1.setText("" + (x * y));
            }
        });
        
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
