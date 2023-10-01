package oop;

import java.awt.Color;
import javax.swing.*;
import java.util.*;

public class JFrameExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        
        JPanel pn1 = new JPanel();    
        JPanel pn2 = new JPanel();
        
        JButton btn1 = new JButton("Panel 1");
        btn1.setBounds(50, 50, 100, 30);
        JButton btn2 = new JButton("Panel 2");
        btn2.setBounds(50, 50, 100, 30);
        
        pn1.add(btn1);
        pn2.add(btn2);
        pn1.setBounds(50, 50, 200, 200);
        pn2.setBounds(260, 50, 200, 200);
        pn1.setBackground(Color.red);
        pn2.setBackground(Color.BLUE);
        
        frame.add(pn1);
        frame.add(pn2);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
