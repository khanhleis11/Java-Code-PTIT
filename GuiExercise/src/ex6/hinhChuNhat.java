package ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hinhChuNhat extends JFrame {
    private JPanel panel1, panel2, panel3;
    private Font customFont = new Font("Arial", Font.PLAIN, 16);
    
    public hinhChuNhat() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel1.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Hình chữ nhật");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setFont(customFont);  
        panel1.add(lbl);
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.white);
        
        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);

        panel2.setLayout(new GridLayout(2, 1));
        JTextArea jta = new JTextArea("Cho độ dài hai cạnh của hình chữ nhật. Giá trị không quá 104.\n" +
                "Viết chương trình tính chu vi và diện tích của hình chữ nhật đó. Nếu dữ liệu không hợp lệ (chiều dài hoặc chiều rộng ≤ 0 thì in ra số 0)\n" +
                "Input\n" +
                "Có duy nhất một dòng ghi hai số nguyên, cách nhau một khoảng trống.\n" +
                "Output\n" +
                "In kết quả trên một dòng, chu vi rồi đến diện tích, cách nhau một khoảng trống.");
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        jta.setFont(customFont);  
        panel2.add(jta);

        JPanel tmp = new JPanel();
        tmp.setLayout(new GridLayout(2, 2));
        JLabel lbl1 = new JLabel("Input");
        JLabel lbl2 = new JLabel("Output");
        JTextField text1 = new JTextField("");
        JTextField text2 = new JTextField("");
        lbl1.setFont(customFont);  
        lbl2.setFont(customFont);  
        text1.setFont(customFont);  
        text2.setFont(customFont);  
        tmp.add(lbl1);
        tmp.add(text1);
        tmp.add(lbl2);
        tmp.add(text2);
        panel2.add(tmp);
        
        panel3.setLayout(new FlowLayout());
        JButton btn = new JButton("Submit!");
        btn.setFont(customFont);
        panel3.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = text1.getText();
                String[] arr = s.split("\\s+");
                int x = Integer.parseInt(arr[0]), y = Integer.parseInt(arr[1]);
                if (x == 0 || y == 0) {
                    text2.setText("Dữ liệu không hợp lệ");
                } else {
                    String ans = "";
                    long p = (long)2 * (x + y);
                    long sq = (long)x * y;
                    ans += p + " " + sq;
                    System.out.println(ans);
                    text2.setText(ans);
                }
            }
            
        });
        
        this.setFont(customFont);  
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
