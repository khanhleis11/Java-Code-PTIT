package ex3;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("Clock");
        this.setLayout(new BorderLayout());
        this.add(new DongHoKim(), BorderLayout.CENTER);
        this.add(new DongHoSo(), BorderLayout.SOUTH);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
