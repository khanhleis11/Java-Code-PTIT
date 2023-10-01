package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        
        JLabel lbl1 = new JLabel("Username");
        lbl1.setBounds(20, 30, 70, 30);
        frame.add(lbl1);
        
        JTextField text1 = new JTextField();
        text1.setBounds(110, 30, 170, 30);
        frame.add(text1);
        
        JLabel lbl2= new JLabel("Password");
        lbl2.setBounds(20, 80, 70, 30);
        frame.add(lbl2);
        
        JPasswordField text2 = new JPasswordField();
        text2.setBounds(110, 80, 170, 30);
        frame.add(text2);
        
        JButton logInBtn = new JButton("Login");
        logInBtn.setBounds(100, 130, 70, 30);
        frame.add(logInBtn);
        
        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(190, 130, 90, 30);
        frame.add(registerBtn);
        
        logInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text1.getText().equals("khanhptit110") && String.valueOf(text2.getPassword()).equals("123456")) {
                    JOptionPane.showMessageDialog(frame, "Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Failed!");
                }
            }
            
        });
        
        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame frame2 = new JFrame("Register Form");
                
                JLabel sub1 = new JLabel("Email");
                sub1.setBounds(30, 30, 50, 30);
                frame2.add(sub1);
                
                JTextField subText1 = new JTextField();
                subText1.setBounds(150, 30, 200, 30);
                frame2.add(subText1);
                
                JLabel sub2 = new JLabel("Username");
                sub2.setBounds(30, 80, 70, 30);
                frame2.add(sub2);
                
                JTextField subText2 = new JTextField();
                subText2.setBounds(150, 80, 200, 30);
                frame2.add(subText2);
                
                JLabel sub3 = new JLabel("Password");
                sub3.setBounds(30, 130, 70, 30);
                frame2.add(sub3);
                
                JPasswordField subText3 = new JPasswordField();
                subText3.setBounds(150, 130, 200, 30);
                frame2.add(subText3);
                
                JLabel sub4 = new JLabel("Comfirm Password");
                sub4.setBounds(30, 180, 120, 30);
                frame2.add(sub4);
                
                JPasswordField subText4 = new JPasswordField();
                subText4.setBounds(150, 180, 200, 30);
                frame2.add(subText4);
                
                JButton subBtn = new JButton("Register");
                subBtn.setBounds(150, 240, 90, 30);
                frame2.add(subBtn);
                
                subBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (subText2.getText().equals("khanhptit110")) {
                            JOptionPane.showMessageDialog(frame2, "Existed Account!");
                        } else {
                            JOptionPane.showMessageDialog(frame2, "Successful!");
                        }
                    }
                    
                });
                
                frame2.setSize(500, 400);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setLayout(null);
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
            }
            
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
