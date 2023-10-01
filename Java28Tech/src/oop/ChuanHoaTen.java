package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class ChuanHoaTen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chuẩn Hóa Tên");
        
        JLabel lbl = new JLabel("Full Name");
        lbl.setBounds(20, 30, 120, 30);
        frame.add(lbl);
        
        JLabel lbl2 = new JLabel("Result");
        lbl2.setBounds(20, 70, 120, 30);
        frame.add(lbl2);
        
        JTextField text1 = new JTextField();
        text1.setBounds(120, 30, 200, 30);
        frame.add(text1);
        
        JTextField text2 = new JTextField();
        text2.setBounds(120, 70, 200, 30);
        frame.add(text2);
        
        JButton btn = new JButton("Convert");
        btn.setBounds(130, 120, 100, 30);
        frame.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = text1.getText();
                StringTokenizer st = new StringTokenizer(s);
                String res = "";
                while (st.hasMoreTokens()) {
                    String tmp = st.nextToken();
                    res += tmp.substring(0, 1).toUpperCase();
                    res += tmp.substring(1).toLowerCase() + " ";
                }
                res = res.trim();
                text2.setText(res);
            }
            
        });
        
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
