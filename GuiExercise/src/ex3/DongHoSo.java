package ex3;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DongHoSo extends JPanel implements Runnable {
    private JLabel digitalClock = new JLabel();
    private Thread clockThread;

    public DongHoSo() {
        digitalClock.setFont(new Font("Arial", Font.BOLD, 30));
        digitalClock.setForeground(Color.black);
        add(digitalClock);
        startRun();
    }

    private void startRun() {
        clockThread = new Thread(this);
        clockThread.start();
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            digitalClock.setText(sdf.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
