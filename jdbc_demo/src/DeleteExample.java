import java.sql.*;

public class DeleteExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/scott";
        String username = "root";
        String password = "your_password";

        String query = "DELETE FROM ORDERS WHERE order_id = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, 1002);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) deleted.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
