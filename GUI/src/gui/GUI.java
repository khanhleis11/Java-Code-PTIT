package gui;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        MyFrame f = new MyFrame("Test");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
