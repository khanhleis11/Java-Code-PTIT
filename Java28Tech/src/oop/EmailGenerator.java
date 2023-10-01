package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class EmailGenerator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Caesar cipher");
        
        JLabel lbl = new JLabel("Name list");
        lbl.setBounds(30, 30, 70, 30);
        frame.add(lbl);
        
        JTextArea jta = new JTextArea();
        jta.setBounds(120, 30, 300, 120);
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);
        frame.add(jta);
        
        JLabel lbl2 = new JLabel("Email Text");
        lbl2.setBounds(30, 180, 70, 30);
        frame.add(lbl2);
        
        JTextArea jta2 = new JTextArea();
        jta2.setBounds(120, 180, 300, 120);
        jta2.setWrapStyleWord(true);
        jta2.setLineWrap(true);
        frame.add(jta2);
        
        JButton generateBtn = new JButton("Generate");
        generateBtn.setBounds(60, 330, 90, 30);
        frame.add(generateBtn);
        
        JButton clearNameBtn = new JButton("Clear Name List");
        clearNameBtn.setBounds(170, 330, 150, 30);
        frame.add(clearNameBtn);
        
        JButton clearEmailBtn = new JButton("Clear Email List");
        clearEmailBtn.setBounds(340, 330, 150, 30);
        frame.add(clearEmailBtn);
        
        clearNameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText("");
            }
        });
        
        clearEmailBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta2.setText("");
            }
        });
        
        generateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jta.getText();
                s = s.trim();
                s = s.toLowerCase();
                String res = "";
                String[] arr = s.split("\\s+");
                for (String x : arr){
                    System.out.println(x);
                }
//                res += arr[arr.length - 1];
//                System.out.println(res);
            }
        });
        
        frame.setSize(520, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
