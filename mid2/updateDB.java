import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class updateDB {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            stmt = conn.createStatement();
            String sql = "UPDATE Employees set age = 30 Where id in (100, 101)";
            stmt.executeUpdate(sql);
            System.out.println("Record updated successfully");
        } catch (SQLException se) {
            se.printStackTrace();
        }}
}
