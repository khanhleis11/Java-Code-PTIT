package ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tinhTong extends JFrame {
    private JPanel panel1, panel2, panel3;
    private Font customFont = new Font("Arial", Font.PLAIN, 16);
    
    public tinhTong() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel1.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Tính tổng N số nguyên dương đầu tiên");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setFont(customFont);  
        panel1.add(lbl);
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.white);
//        panel3.setBackground(Color.);

        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);

        panel2.setLayout(new GridLayout(2, 1));
        JTextArea jta = new JTextArea("Cho số nguyên dương N. \n" +
"\n" +
"Hãy tính S = 1 + 2 + ... + N\n" +
"\n" +
"Dữ liệu vào: \n" +
"\n" +
"Dòng đầu ghi số bộ test, không quá 10\n" +
"Mỗi dòng ghi một số nguyên dương N, không quá 10^9\n" +
"Kết quả:\n" +
"\n" +
"Với mỗi test, ghi kết quả trên một dòng.");
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        jta.setFont(customFont); 
        panel2.add(jta);

        JPanel tmp = new JPanel();
        tmp.setLayout(new GridLayout(2, 2));
        JLabel lbl1 = new JLabel("Input");
        JLabel lbl2 = new JLabel("Output");
        JTextArea text1 = new JTextArea("");
        JTextArea text2 = new JTextArea("");
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
                s.trim();
                String[] arr = s.split("\\s+");
                int t = Integer.parseInt(arr[0]);
                int cnt = 1;
                String res = "";
                while (t --> 0) {
                    int n = Integer.parseInt(arr[cnt]);
                    long ans = (long)n * (n + 1) / 2;
                    res += ans + "\n";
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
