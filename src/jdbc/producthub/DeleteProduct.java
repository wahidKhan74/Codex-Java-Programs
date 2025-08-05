package jdbc.producthub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProduct {

  // 🔁 Delete Product
  static void deleteProduct(Scanner scanner, Connection conn) {
    System.out.print("Enter product ID to delete: ");
    int id = scanner.nextInt();

    String sql = "DELETE FROM products WHERE id = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setInt(1, id);
      int rows = stmt.executeUpdate();
      System.out.println(rows + " product(s) deleted.");
    } catch (SQLException e) {
      System.out.println("Operation Error : Delete product failed : " +e.getMessage());
    }
  }
}
