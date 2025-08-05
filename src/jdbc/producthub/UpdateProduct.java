package jdbc.producthub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateProduct {

  // 🔁 Update Product
  static void updateProduct(Scanner scanner, Connection conn) {
    System.out.print("Enter product ID to update: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter new name: ");
    String name = scanner.nextLine();

    System.out.print("Enter new price: ");
    double price = scanner.nextDouble();

    System.out.print("Enter new stock: ");
    int stock = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter new description: ");
    String description = scanner.nextLine();

    String sql = "UPDATE products SET name = ?, price = ?, stock = ?, description = ? WHERE id = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, name);
      stmt.setDouble(2, price);
      stmt.setInt(3, stock);
      stmt.setString(4, description);
      stmt.setInt(5, id);
      int rows = stmt.executeUpdate();
      System.out.println(rows + " product(s) updated.");
    } catch (SQLException e) {
      System.out.println("Operation Error : Update product failed : " +e.getMessage());
    }
  }
}
