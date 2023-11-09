package gui;
   
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame (String title) throws HeadlessException{
        super(title);
        setLayout(new GridLayout(1, 2));
        add(new JButton("Food to be placed here"));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            p2.add(new JButton("" + i));
        }
        
        p2.add(new JButton("0"));
        p2.add(new JButton("Stop"));
        p2.add(new JButton("Exit"));
        p1.add(p2, BorderLayout.CENTER);
        add(p1);
    }
    
}
