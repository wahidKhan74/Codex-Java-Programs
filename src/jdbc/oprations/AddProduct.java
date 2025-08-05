package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddProduct {

  public static void main(String[] args) {

    try {
      // create connection
      DbConn dbConn = new DbConn();
      Connection connection = dbConn.get();

      // create statement
      Statement stm = connection.createStatement();

      // 4. Execute query
      String insertQuery = "INSERT INTO products "
        + "(id, name, description, category, brand, barcode, price, discount, cost_price, stock) "
        + "VALUES (50001, 'Wireless Mouse', 'Ergonomic wireless mouse with long battery life and fast response time.', "
        + "'Electronics', 'LogiTech', '1234567890123', 1299.00, 10.00, 800.00, 150);";

      // create or update or delete executeUpdate
      int rowAffected = stm.executeUpdate(insertQuery);

      System.out.println(rowAffected + " Product created successfully");

      stm.close();
      connection.close();
    } catch (SQLException ex) {
      System.out.println("Operation Error : Add product failed : " +ex.getMessage());
    }
  }
}
