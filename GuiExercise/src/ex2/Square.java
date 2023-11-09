package ex2;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Geometry {
    private static final int SIZE = 150;

    public Square(int scale, String type, Color color) {
        super(scale, type, color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);

        int side = SIZE * scale;

        if ("Fill".equals(type)) {
            g.fillRect((getWidth() - side) / 2, (getHeight() - side) / 2, side, side);
        } else {
            g.drawRect((getWidth() - side) / 2, (getHeight() - side) / 2, side, side);
        }
    }
}
