package ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JComboBox<String> options;
    private JButton btn;
    private JPanel panel1, panel2, panel3;

    private Font customFont = new Font("Arial", Font.PLAIN, 16);

    public MyFrame(String title) {
        super(title);
        options = new JComboBox<>();
        options.addItem("Hình chữ nhật");
        options.addItem("Tính tổng N số nguyên dương đầu tiên");
        options.addItem("Giải phương trình bậc nhất");
        options.addItem("Số nguyên tố");
        options.addItem("Phân tích thừa số nguyên tố");
        options.setFont(customFont);
        btn = new JButton("OK");
        btn.setFont(customFont);
        this.setLayout(new FlowLayout());
        this.add(options);
        this.add(btn);


        this.setFont(customFont); 
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = options.getSelectedItem().toString();
                if (s.equals("Hình chữ nhật")) {
                    new hinhChuNhat();
                } else if (s.equals("Tính tổng N số nguyên dương đầu tiên")) {
                    new tinhTong();
                } else if (s.equals("Giải phương trình bậc nhất")) {
                    new giaiPhuongTrinhBacNhat();
                } else if (s.equals("Số nguyên tố")) {
                    new soNguyenTo();
                } else {
                    new phanTichThuaSoNguyenTo();
                }
            }
            
        });

    }
}