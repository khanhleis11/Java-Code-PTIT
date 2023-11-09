package ex2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Polygons extends Geometry {
    private static final int SIZE = 150;

    public Polygons(int scale, String type, Color color) {
        super(scale, type, color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(SIZE * scale, SIZE * scale) * 0.4);

        Polygon polygon = new Polygon();

        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI * i / 6;
            int x = xCenter + (int) (radius * Math.cos(angle));
            int y = yCenter - (int) (radius * Math.sin(angle));
            polygon.addPoint(x, y);
        }

        if ("Fill".equals(type))
            g.fillPolygon(polygon);
        else
            g.drawPolygon(polygon);
    }
}
