package jdbc.producthub;

import java.sql.*;
import java.util.Scanner;

public class ViewProduct {

  // 🔁 View Products
  static void viewProducts(Connection conn) {
    String sql = "SELECT * FROM products";
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

      System.out.println("\n--- Product List ---");
      while (rs.next()) {
        System.out.printf("ID: %d | Name: %s | Price: %.2f | Stock: %d | Description: %s%n",
          rs.getInt("id"),
          rs.getString("name"),
          rs.getDouble("price"),
          rs.getInt("stock"),
          rs.getString("description"));
      }
    } catch (SQLException ex) {
      System.out.println("Operation Error : View product failed : " +ex.getMessage());
    }
  }
}
