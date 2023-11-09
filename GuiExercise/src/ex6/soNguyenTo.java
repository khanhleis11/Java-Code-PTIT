package ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class soNguyenTo extends JFrame {
    private JPanel panel1, panel2, panel3;
    private Font customFont = new Font("Arial", Font.PLAIN, 16);
    
    private static boolean check(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public soNguyenTo() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel1.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Số nguyên tố");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setFont(customFont);  // Set the custom font
        panel1.add(lbl);
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.white);
//        panel3.setBackground(Color.);

        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);

        panel2.setLayout(new GridLayout(2, 1));
        JTextArea jta = new JTextArea("Viết chương trình kiểm tra một số nguyên dương có phải số nguyên tố hay không. \nDòng đầu của dữ liệu vào ghi số bộ test.\nMỗi dòng tiếp theo có một nguyên dương không quá 9 chữ số. \nKết quả in ra YES nếu đó là số nguyên tố, in ra NO nếu ngược lại.");
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        jta.setFont(customFont);  // Set the custom font for the JTextArea
        panel2.add(jta);

        JPanel tmp = new JPanel();
        tmp.setLayout(new GridLayout(2, 2));
        JLabel lbl1 = new JLabel("Input");
        JLabel lbl2 = new JLabel("Output");
        JTextArea text1 = new JTextArea("");
        JTextArea text2 = new JTextArea("");
        lbl1.setFont(customFont);  // Set the custom font for labels
        lbl2.setFont(customFont);  // Set the custom font for labels
        text1.setFont(customFont);  // Set the custom font for text fields
        text2.setFont(customFont);  // Set the custom font for text fields
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
                s.trim();
                String[] arr = s.split("\\s+");
                int t = Integer.parseInt(arr[0]);
                int cnt = 1;
                String res = "";
                while (t --> 0) {
                    int n = Integer.parseInt(arr[cnt]);
                    if (check(n)) {
                        res += "YES\n";
                    } else {
                        res += "NO\n";
                    }
                   
                    cnt++;
                }
                text2.setText(res);
            }
            
        });
        
        this.setFont(customFont); 
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
