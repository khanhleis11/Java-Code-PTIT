package ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DisplayPicturePanel extends JPanel {
    private BufferedImage image;

    public DisplayPicturePanel(BufferedImage image) {
        this.image = image;
        setPreferredSize(new Dimension(250, 156));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }
}
