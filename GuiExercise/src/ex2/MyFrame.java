package ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private Font customFont = new Font("Arial", Font.PLAIN, 16);
    private JPanel tools;
    private JButton btn;
    private JComboBox<String> color;
    private JComboBox<String> type;
    private JComboBox<String> zoom;
    private JComboBox<String> geometry;
    private String selectedType;
    private Color selectedColor;
    private int scale = 1;

    public MyFrame() throws HeadlessException {
        super("Drawing Geometry");

        tools = new JPanel();
        tools.setFont(customFont);
        color = new JComboBox<>();
        color.setFont(customFont);
        type = new JComboBox<>();
        type.setFont(customFont);
        zoom = new JComboBox<>();
        zoom.setFont(customFont);
        geometry = new JComboBox<>();
        geometry.setFont(customFont);
        btn = new JButton("OK");
        btn.setFont(customFont);
        selectedColor = Color.red;
        selectedType = "Fill";

        setLayout(new BorderLayout());

        type.addItem("Fill");
        type.addItem("Not Fill");

        color.addItem("Red");
        color.addItem("Green");
        color.addItem("Blue");
        color.addItem("Yellow");

        zoom.addItem("1x");
        zoom.addItem("2x");
        zoom.addItem("3x");
        zoom.addItem("4x");

        geometry.addItem("Rectangle");
        geometry.addItem("Square");
        geometry.addItem("Circle");
        geometry.addItem("Polygon");

        tools.setLayout(new FlowLayout());
        
        tools.add(geometry);
        tools.add(type);
        tools.add(color);
        tools.add(zoom);
        tools.add(btn);
        add(tools, BorderLayout.SOUTH);

        btn.addActionListener(this);

        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        //pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            String mau = color.getSelectedItem().toString();
            if (mau.equals("Red")) {
                selectedColor = Color.red;
            } else if (mau.equals("Yellow")) {
                selectedColor = Color.yellow;
            } else if (mau.equals("Green")) {
                selectedColor = Color.green;
            } else {
                selectedColor = Color.blue;
            }
            selectedType = type.getSelectedItem().toString();
            scale = zoom.getSelectedItem().toString().charAt(0) - '0';
            if ("Rectangle".equals(geometry.getSelectedItem().toString())) {
                add(new Rectangle(scale, selectedType, selectedColor));
            } else if ("Square".equals(geometry.getSelectedItem().toString())) {
                add(new Square(scale, selectedType, selectedColor));
            } else if ("Circle".equals(geometry.getSelectedItem().toString())) {
                add(new Circle(scale, selectedType, selectedColor));
            } else if ("Polygon".equals(geometry.getSelectedItem().toString())) {
                add(new Polygons(scale, selectedType, selectedColor));
            }
            setVisible(true);
        }
    }
}

