package oop;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Chess {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        
        JButton[] btn = new JButton[64];
        for (int i = 0; i < 64; i++) {
            btn[i] = new JButton();
        }
        
        frame.setLayout(new GridLayout(8, 8));
        
        for (int i = 0; i < 64; i++) {
            if ((i / 8) % 2 == 0) {
                if (i % 2 == 0) {
                    btn[i].setBackground(Color.BLACK);
                    frame.add(btn[i]);
                } else {
                    btn[i].setBackground(Color.WHITE);
                    frame.add(btn[i]);
                } 
            } else {
                if (i % 2 != 0) {
                    btn[i].setBackground(Color.BLACK);
                    frame.add(btn[i]);
                } else {
                    btn[i].setBackground(Color.WHITE);
                    frame.add(btn[i]);
                } 
            }
        }
        
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
