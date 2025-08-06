package jdbc.producthub;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ProductSummary {

  // Get Product Summary
  static void getProductSummary(Connection conn) {

    try (CallableStatement stmt = conn.prepareCall("{ call GetProductSummary(?, ?, ?) }")) {

      // Register OUT parameters
      stmt.registerOutParameter(1, Types.INTEGER);
      stmt.registerOutParameter(2, Types.DECIMAL);
      stmt.registerOutParameter(3, Types.INTEGER);

      // Execute stored procedure
      stmt.execute();

      // Retrieve values
      int productCount  = stmt.getInt(1);
      BigDecimal totalPrice  = stmt.getBigDecimal(2);
      int totalStock  = stmt.getInt(3);

      // Print results
      System.out.println("Total Products: " + productCount);
      System.out.println("Total Price: " + totalPrice);
      System.out.println("Total Stock: " + totalStock);

    } catch (SQLException e) {
      System.out.println("Operation Error : product summary failed : " +e.getMessage());
    }
  }
}
