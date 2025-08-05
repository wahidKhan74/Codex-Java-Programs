package jdbc.producthub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddProduct {

  // 🔁 Add Product
  static void addProduct(Scanner scanner, Connection conn) {
    System.out.print("Enter product name: ");
    String name = scanner.nextLine();

    System.out.print("Enter price: ");
    double price = scanner.nextDouble();

    System.out.print("Enter stock: ");
    int stock = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter description: ");
    String description = scanner.nextLine();

    String sql = "INSERT INTO products (name, price, stock, description) VALUES (?, ?, ?, ?)";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, name);
      stmt.setDouble(2, price);
      stmt.setInt(3, stock);
      stmt.setString(4, description);
      int rows = stmt.executeUpdate();
      System.out.println(rows + " product(s) added.");
    } catch (SQLException e) {
      System.out.println("Operation Error : Add product failed : " +e.getMessage());
    }
  }
}
