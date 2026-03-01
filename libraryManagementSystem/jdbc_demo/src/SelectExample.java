import java.sql.*;

public class SelectExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/scott";
        String username = "root";
        String password = "your_password";

        String query = "SELECT * FROM ORDERS";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("order_id");
                Date date = rs.getDate("order_date");
                String name = rs.getString("customer_name");

                System.out.println(id + " | " + date + " | " + name);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
