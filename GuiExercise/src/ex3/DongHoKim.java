package ex3;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class DongHoKim extends JPanel implements Runnable {
    private int hour;
    private int minute;
    private int second;
    private Thread clockThread;

    public DongHoKim() {
        startRun();
    }

    private void startRun() {
        clockThread = new Thread(this);
        clockThread.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int clockRadius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        g.setColor(Color.black);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);

        drawClockNumbers(g, xCenter, yCenter, clockRadius);

        int sLength = (int) (clockRadius * 0.8);
        Point xSecond = calculatePosition(xCenter, second, 60, sLength);
        g.setColor(Color.red);
        g.drawLine(xCenter, yCenter, xSecond.x, xSecond.y);

        int mLength = (int) (clockRadius * 0.65);
        Point xMinute = calculatePosition(xCenter, minute, 60, mLength);
        g.setColor(Color.blue);
        g.drawLine(xCenter, yCenter, xMinute.x, xMinute.y);

        int hLength = (int) (clockRadius * 0.5);
        Point xHour = calculatePosition(xCenter, hour, 12, hLength);
        g.setColor(Color.BLACK);
        g.drawLine(xCenter, yCenter, xHour.x, xHour.y);
    }

    private void drawClockNumbers(Graphics g, int xCenter, int yCenter, int clockRadius) {
        String[] numbers = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        for (int i = 0; i < 12; i++) {
            int angle = (i * 360 / 12) - 90;  // Calculate angle in degrees
            int x = xCenter + (int) (0.8 * clockRadius * Math.cos(Math.toRadians(angle)));
            int y = yCenter + (int) (0.8 * clockRadius * Math.sin(Math.toRadians(angle)));
            g.drawString(numbers[i], x, y);
        }
    }

    private Point calculatePosition(int center, int value, int max, int length) {
        int angle = (value * 360 / max) - 90;  // Calculate angle in degrees
        int x = center + (int) (length * Math.cos(Math.toRadians(angle)));
        int y = center + (int) (length * Math.sin(Math.toRadians(angle)));
        return new Point(x, y);
    }

    private void setCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    @Override
    public void run() {
        while (true) {
            setCurrentTime();
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
