package oop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DeleteRowExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student List");
        
        JPanel panel1 = new JPanel();
        
        Object[][] row = {
            {"SV01", "Nguyen Van Nam", "CNTT1", 3.2},
            {"SV03", "Nguyen Hung Lam", "CNTT2", 2.7},
            {"SV02", "Vo Quoc Lam", "DTVT1", 3.1},
            {"SV04", "Tran Van Thang", "CNTT2", 2.8},
        };
        Object[] col = {"ID", "Ho ten", "Lop", "GPA"};
        JTable table = new JTable(new DefaultTableModel(row, col));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        JScrollPane scrollPane = new JScrollPane(table);
        table.setAutoCreateRowSorter(true);
        panel1.setBackground(Color.green);
        
        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(50, 30, 60, 30);
        panel1.add(deleteBtn);
        
        frame.setLayout(new BorderLayout());
        
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.SOUTH);
        
        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowDel = table.getSelectedRow();
                if (rowDel != -1 ) {
                    model.removeRow(rowDel);
                }
            }
            
        });
        
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}