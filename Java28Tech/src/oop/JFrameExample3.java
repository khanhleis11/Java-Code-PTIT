package oop;

import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;

public class JFrameExample3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        
        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("WEST");
        JButton btn3 = new JButton("CENTER");
        JButton btn4 = new JButton("EAST");
        JButton btn5 = new JButton("SOUTH");
        
        frame.setLayout(new BorderLayout());
        
        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.WEST);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.EAST);
        frame.add(btn5, BorderLayout.SOUTH);
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
