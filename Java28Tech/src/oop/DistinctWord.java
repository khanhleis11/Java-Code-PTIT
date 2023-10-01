package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class DistinctWord {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Distinct Word");
        
        JLabel lbl = new JLabel("Data");
        lbl.setBounds(15, 25, 40, 30);
        frame.add(lbl);
        
        JTextArea jta = new JTextArea();
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        jta.setBounds(60, 25, 300, 200);
        frame.add(jta);
        
        JButton btn = new JButton("Count");
        btn.setBounds(20, 250, 70, 30);
        frame.add(btn);
        
        JLabel lbl2 = new JLabel("Number of distinct word: ");
        lbl2.setBounds(15, 290, 180, 30);
        frame.add(lbl2);
        
        JTextField text = new JTextField();
        text.setBounds(180, 290, 180, 30);
        frame.add(text);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jta.getText();
                StringTokenizer st = new StringTokenizer(s);
                HashSet<String> se = new HashSet<>();
                while (st.hasMoreTokens()) {
                    se.add(st.nextToken());
                }
                text.setText("" + se.size());
            }
            
        });
        
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
