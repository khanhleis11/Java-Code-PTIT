package ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class giaiPhuongTrinhBacNhat extends JFrame{
    private JPanel panel1, panel2, panel3;
    private Font customFont = new Font("Arial", Font.PLAIN, 16);
    
    public giaiPhuongTrinhBacNhat() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel1.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Giải phương trình bậc nhất");
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
        JTextArea jta = new JTextArea("Phương trình bậc nhất là phương trình dạng ax + b = 0.\n" +
"Viết chương trình nhập vào hệ số a,b là các số thực và thực hiện giải phương trình bậc nhất.\n" +
"\n" +
"Nếu phương trình vô nghiệm thì in ra VN\n" +
"Nếu phương trình có vô số nghiệm thì in ra VSN\n" +
"Nếu phương trình có nghiệm duy nhất thì in ra với định dạng luôn 2 chữ số thập phân. \n" +
"Input\n" +
"\n" +
"Chỉ có hai số thực a và b. \n" +
"\n" +
"Output\n" +
"\n" +
"Ghi ra kết quả theo yêu cầu. ");
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
                String[] arr = text1.getText().split("\\s+");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                if (a == 0) {
                    if (b == 0) {
                        text2.setText("VSN");
                    } else {
                        text2.setText("VN");
                    }
                } else {
                    double x = (double) -b / a;
                    text2.setText("" + String.format("%.2f", x));
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
