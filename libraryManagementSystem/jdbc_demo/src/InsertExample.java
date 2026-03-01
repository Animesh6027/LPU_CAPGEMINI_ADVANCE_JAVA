import java.sql.*;

public class InsertExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/scott";
        String username = "root";
        String password = "your_password";

        String query = "INSERT INTO ORDERS (order_id, order_date, customer_name) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, 1002);
            ps.setDate(2, Date.valueOf("2026-02-12"));
            ps.setString(3, "Animesh");

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
