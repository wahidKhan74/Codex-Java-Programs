package jdbc.producthub;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class SaveAndDelete {
  // 🔁 Delete Product
  static void saveAndDeleteProduct(Scanner scanner, Connection conn) {
    System.out.print("Enter product ID to delete: ");
    int id = scanner.nextInt();


    try (CallableStatement stmt = conn.prepareCall("{ call FindSaveAndDeletedProduct(?) }")) {
      stmt.setInt(1, id);
      int rows = stmt.executeUpdate();
      System.out.println(rows + " save and product(s) deleted.");
    } catch (SQLException e) {
      System.out.println("Operation Error : Save and Delete product failed : " +e.getMessage());
    }
  }
}
