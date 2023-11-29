import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class Example {
    private static String url = "jdbc:mysql://localhost:3306/quanlysinhvien?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "Khanh2003!";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return (Connection) DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        con.setAutoCommit(false);

        if (con != null) {
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM sinhVien";
            ResultSet rs = stmt.executeQuery(sql);
            int columnCount = rs.getMetaData().getColumnCount();

            DefaultTableModel tableModel = new DefaultTableModel();

            // Add column names to the model
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }

            // Add rows to the model
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(row);
            }

            // Create the JTable with the DefaultTableModel
            JTable table = new JTable(tableModel);

            // Set preferred column widths
            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(100);  // Adjust the width as needed
            columnModel.getColumn(1).setPreferredWidth(200);  // Adjust the width as needed
            columnModel.getColumn(2).setPreferredWidth(150);  // Adjust the width as needed
            columnModel.getColumn(3).setPreferredWidth(100);  // Adjust the width as needed

            JFrame frame = new JFrame("JFrame Example");
            JPanel panel1, panel2;
            JButton btn1, btn2, btn3, btn4, btn5;
            Font customFont = new Font("Arial", Font.PLAIN, 16);
            panel1 = new JPanel();
            panel2 = new JPanel();
            btn1 = new JButton("Display");
            btn1.setFont(customFont);
            btn2 = new JButton("Insert");
            btn2.setFont(customFont);
            btn3 = new JButton("Update");
            btn3.setFont(customFont);
            btn4 = new JButton("Delete");
            btn4.setFont(customFont);
            btn5 = new JButton("Reset");
            btn5.setFont(customFont);

            // Use the same DefaultTableModel for both tables
            JTable table1 = new JTable(tableModel);

            panel1.add(table);
            frame.setLayout(new BorderLayout());
            frame.add(panel1, BorderLayout.CENTER);
            panel2.setLayout(new FlowLayout());
            
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel1.setVisible(true);
                }
                
            });
            
            // Add ActionListener to "Reset" button to clear all data in the table
            btn5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Clear all rows from the model
                    int rowCount = tableModel.getRowCount();
                    int columnCount = tableModel.getColumnCount();
                    for (int i = 0; i < rowCount; i++) {
                        for (int j = 0; j < columnCount; j++) {
                            tableModel.setValueAt("", i, j);
                        }
                    }
                }
            });
            
            btn4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = table.getSelectedRow();

                    if (selectedRow != -1) { // Check if any row is selected
                        // Clear data of the selected row
                        int columnCount = tableModel.getColumnCount();
                        for (int j = 0; j < columnCount; j++) {
                            tableModel.setValueAt("", selectedRow, j);
                        }
                    } else {
                        // Show a message if no row is selected
                        JOptionPane.showMessageDialog(null, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
                    }
                }
            });
            btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                int selectedColumn = table.getSelectedColumn();

                if (selectedRow != -1 && selectedColumn != -1) { // Check if any cell is selected
                    // Assuming you have some way to input the updated data, for example using a JTextField
                    // Replace this line with your actual input method
                    String updatedData = JOptionPane.showInputDialog("Enter updated data");

                    // Update the data in the selected cell
                    tableModel.setValueAt(updatedData, selectedRow, selectedColumn);
                } else {
                    // Show a message if no cell is selected
                    JOptionPane.showMessageDialog(null, "Please select a cell to update.", "No Cell Selected", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
            panel2.add(btn1);
            panel2.add(btn2);
            panel2.add(btn3);
            panel2.add(btn4);
            panel2.add(btn5);
            panel2.setFont(customFont);
            panel1.setVisible(false);
            frame.add(panel2, BorderLayout.SOUTH);
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } else {
            System.out.println("Failed!");
        }
    }
}