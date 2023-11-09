package ex5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements ActionListener {
    private JPanel imagePanel;
    private JPanel controlPanel;
    private JButton importButton;
    private JButton resizeButton;
    private JTextField widthField, heightField;
    private JLabel widthLabel, heightLabel;
    private Font customFont = new Font("Arial", Font.PLAIN, 16);

    public MyFrame() throws HeadlessException {
        super("Image Display and Resize");
        imagePanel = new JPanel();
        imagePanel.setFont(customFont);
        controlPanel = new JPanel();
        controlPanel.setFont(customFont);
        importButton = new JButton("Import Image");
        importButton.setFont(customFont);
        widthField = new JTextField("1200");
        widthField.setFont(customFont);
        heightField = new JTextField("800");
        heightField.setFont(customFont);
        widthLabel = new JLabel("Width:");
        widthLabel.setFont(customFont);
        heightLabel = new JLabel("Height:");
        heightLabel.setFont(customFont);
        widthField.setColumns(4);
        heightField.setColumns(4);
        resizeButton = new JButton("Resize Image");
        resizeButton.setFont(customFont);

        setLayout(new BorderLayout());
        imagePanel.setLayout(new FlowLayout());
        controlPanel.setLayout(new FlowLayout());
        add(imagePanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        controlPanel.add(importButton);
        controlPanel.add(widthLabel);
        controlPanel.add(widthField);
        controlPanel.add(heightLabel);
        controlPanel.add(heightField);
        controlPanel.add(resizeButton);

        importButton.addActionListener(this);
        resizeButton.addActionListener(this);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == importButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            try {
                BufferedImage image = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                imagePanel.add(new DisplayPicturePanel(image));
                setVisible(true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource() == resizeButton) {
            setSize(Integer.parseInt(widthField.getText()), Integer.parseInt(heightField.getText()));
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
