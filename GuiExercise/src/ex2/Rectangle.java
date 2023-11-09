package ex2;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Geometry {
    private static final int WIDTH = 150;
    private static final int HEIGHT = 90;

    public Rectangle(int scale, String type, Color color) {
        super(scale, type, color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);

        int x = getWidth() / 2 - WIDTH * scale / 2;
        int y = getHeight() / 2 - HEIGHT * scale / 2;

        if ("Fill".equals(type))
            g.fillRect(x, y, WIDTH * scale, HEIGHT * scale);
        else
            g.drawRect(x, y, WIDTH * scale, HEIGHT * scale);
    }
}
