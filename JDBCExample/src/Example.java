import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
import java.util.*;

public class Example {
    // url, username, password
    private static String url = "jdbc:mysql://localhost:3306/northwind?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "Khanh2003!";
        
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // Nap driver
        Class.forName("com.mysql.jdbc.Driver");
        return (Connection) DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        System.setProperty("console.encoding", "UTF-8");
        Connection con = getConnection();
        con.setAutoCommit(false);
        Scanner sc = new Scanner(System.in);
        if (con != null) {
            
//            SELECT --> executeQuery --> ResultSet
//            DELETE, INSERT, DROP, ALTER --> executeUpdate
            
            
            // truy van, update du lieu
//            Statement stmt = con.createStatement();
            // Truy van
//            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
////            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers WHERE CustomerID >= 10");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString("ContactName")
//                + " " + rs.getString("Address") + " " + rs.getString("City") + " " + rs.getString(6));
//            }

//            Doan nay la cap nhat
//            int row = stmt.executeUpdate("INSERT INTO Customers VALUES(2019, 'Le Quoc Khanh', 'Bruno', 'Thai Binh', 'Thai Binh', 17, 'Vietnam');");
//            System.out.println(row);
//            stmt.executeUpdate("DELETE FROM Customers WHERE CustomerName = 'Vu Quang Minh'");

//            PreparedStatement: dùng để thực thi câu lệnh có tham số
            
            try{
                PreparedStatement stmt = con.prepareStatement("INSERT INTO Customers VALUES(?, ?, ?, ?, ?, ?, ?)");
                int n = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < n; i++) {
                    int id = Integer.parseInt(sc.nextLine());
                    String name = sc.nextLine();
                    String contactName = sc.nextLine();
                    String address = sc.nextLine();
                    String city = sc.nextLine();
                    String code = sc.nextLine();
                    String country = sc.nextLine();
                    stmt.setInt(1, id);
                    stmt.setString(2, name);
                    stmt.setString(3, contactName);
                    stmt.setString(4, address);
                    stmt.setString(5, city);
                    stmt.setString(6, code);
                    stmt.setString(7, country);
                    stmt.executeUpdate();
                }
                con.commit();
            } catch (Exception e) {
                System.out.println(e);
                con.rollback();
            }

//            One more example
//            PreparedStatement stmt = con.prepareStatement("SELECT * FROM customers WHERE CustomerID >= ? AND Country = ?");
//            stmt.setInt(1, Integer.parseInt(sc.nextLine()));
//            stmt.setString(2, sc.nextLine());
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2));
//            }

        } else {
            System.out.println("Failed!");
        }
    }
}
