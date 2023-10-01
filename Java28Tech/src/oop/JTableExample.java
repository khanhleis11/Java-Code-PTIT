package oop;

import java.util.*;
import javax.swing.*;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable");
        
        Object[][] row = {
            {"SV01", "Le Quoc Khanh", "CNTT1", 3.6},
            {"SV02", "Vu Quang Minh", "ATTT1", 3.8},
            {"SV03", "Ta Dong Phong", "CNTT3", 3.2},
            {"SV04", "Nguyen The Hung", "CNTT1", 3.4},
        };
        
        Object[] col = {"ID", "Ho va ten", "Lop", "GPA"};
        
        JTable table = new JTable(row, col);
//        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        
        
        frame.add(scrollPane);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        table.setAutoCreateRowSorter(true);
        
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                System.out.print(table.getValueAt(i, j) + " ");
            }
            System.out.println("");
        }
    }

//    private JTable(Object[][] row, Object[] col) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
