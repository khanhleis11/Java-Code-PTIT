package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class JFrameExample1 {
    public static void main(String[] args) {
        
//        JPasswordField area
//        JFrame frame = new JFrame("JFrame Example");
//        
//        JPasswordField password = new JPasswordField();
//        password.setBounds(40, 50, 130, 30);
//        frame.add(password);
//        
//        JButton btn = new JButton("Click");
//        btn.setBounds(40, 100, 70, 30);
//        frame.add(btn);
//        
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String s = String.valueOf(password.getPassword());
//                System.out.println(s);
//            }
//            
//        });
//        
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setLayout(null);
//        frame.setVisible(true);

//        JOptionPane area
        JFrame frame = new JFrame("JPasswordField Example");
        
        JLabel lbl1 = new JLabel("Username : ");
        JLabel lbl2 = new JLabel("Password : ");
        lbl1.setBounds(50, 50, 100, 30);
        lbl2.setBounds(50, 100, 100, 30);
        
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        username.setBounds(150, 50, 150, 30);
        password.setBounds(150, 100, 150, 30);
        
        JButton login = new JButton("Login");
        login.setBounds(100, 150, 80, 30);
        
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(username);
        frame.add(password);
        frame.add(login);
        
        login.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("28tech") &&
                    String.valueOf(password.getPassword()).equals("28tech")){
                    JOptionPane.showMessageDialog(frame, "Successful !");
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Failed !");
                }
            }
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
