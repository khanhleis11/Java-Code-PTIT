package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        
//        Label area
        JLabel lbl = new JLabel("Username");
        lbl.setBounds(50, 30, 100, 30);
        frame.add(lbl);
        
        JLabel lbl2 = new JLabel("Password");
        lbl2.setBounds(50, 70, 100, 30);
        frame.add(lbl2);
        
        JTextField username = new JTextField("");
        JTextField password = new JTextField("");
        
        username.setBounds(150, 30, 130, 30);
        password.setBounds(150, 70, 130, 30);
        frame.add(username);
        frame.add(password);
        
        JButton logIn = new JButton("Log In");
        logIn.setBounds(130, 130, 100, 30);
        frame.add(logIn);
        
        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(username.getText());
                System.out.println(password.getText());
            }
            
        });
        
//        JTextArea: Lưu được text trên 1 đoạn văn
        JTextArea jta = new JTextArea();
        jta.setBounds(50, 180, 300, 100);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        frame.add(jta);
        
//        Button Area
//        JButton btn = new JButton("Username");
//        btn.setBounds(50, 30, 100, 30);
//        
//        JButton btn2 = new JButton("Password");
//        btn2.setBounds(50, 70, 100, 30);
//        
//        frame.add(btn);
//        frame.add(btn2);
//        
//        // AddEventonButton
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Cam on bau Duc");
//                btn.setText("Click");
//            }
//            
//        });
//        
//        btn2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Cam on bau Hien");
//            }
//            
//        });
        
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null); // set layout để button không bị tràn ra frame
        frame.setVisible(true);
    }
}
