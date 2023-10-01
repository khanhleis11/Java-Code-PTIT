package oop;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DefaultTableModelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        Object[][] row = {
            {"SV01", "Nguyen Van Nam", "CNTT1", 3.2},
            {"SV03", "Nguyen Hung Lam", "CNTT2", 2.7},
            {"SV02", "Vo Quoc Lam", "DTVT1", 3.1},
            {"SV04", "Tran Van Thang", "CNTT2", 2.8},
        };
        Object[] col = {"ID", "Ho ten", "Lop", "GPA"};
        JTable table = new JTable(new DefaultTableModel(row, col));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setAutoCreateRowSorter(true);
        frame.add(scrollPane);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Vector<Vector> data = model.getDataVector();

        for (int i = 0; i < data.size(); i++) {
//            Vector<Object> rowVector = data.get(i);
            System.out.println(data.get(i));
        }
        model.addRow(new Object[] {"SV05", "Le Quoc Khanh", "ATTT2", 4.0});
        model.removeRow(table.getSelectedRow());
    }
}
