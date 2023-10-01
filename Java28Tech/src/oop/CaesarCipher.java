package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Caesar cipher");
        
        JLabel lbl = new JLabel("Plain Text");
        lbl.setBounds(30, 30, 70, 30);
        frame.add(lbl);
        
        JTextArea jta = new JTextArea();
        jta.setBounds(120, 30, 300, 120);
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);
        frame.add(jta);
        
        JLabel lbl2 = new JLabel("Cipher Text");
        lbl2.setBounds(30, 180, 70, 30);
        frame.add(lbl2);
        
        JTextArea jta2 = new JTextArea();
        jta2.setBounds(120, 180, 300, 120);
        jta2.setWrapStyleWord(true);
        jta2.setLineWrap(true);
        frame.add(jta2);
        
        JButton btn = new JButton("Encode");
        btn.setBounds(150, 320, 80, 30);
        frame.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jta.getText();
                String res = "";
                for (char x : s.toCharArray()) {
                    if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
                        char tmp = (char)((x + 7));
                        if (tmp > 'z') {
//                            res += (int)x;
                            res += (char)(x - 26 + 7);
                        } else {
                            res += tmp;
                        }
                        
                    } else {
                        res += x;
                    }
                }
                System.out.println(res);
            }
            
        });
        
        frame.setSize(500, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
