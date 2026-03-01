import java.sql.*;

public class UpdateExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/scott";
        String username = "root";
        String password = "your_password";

        String query = "UPDATE ORDERS SET customer_name = ? WHERE order_id = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, "Updated_Name");
            ps.setInt(2, 1002);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
