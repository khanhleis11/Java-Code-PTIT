package ex2;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Geometry {
    private static final int SIZE = 150;

    public Circle(int scale, String type, Color color) {
        super(scale, type, color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);

        int diameter = SIZE * scale;

        if ("Fill".equals(type)) {
            g.fillOval((getWidth() - diameter) / 2, (getHeight() - diameter) / 2, diameter, diameter);
        } else {
            g.drawOval((getWidth() - diameter) / 2, (getHeight() - diameter) / 2, diameter, diameter);
        }
    }
}
