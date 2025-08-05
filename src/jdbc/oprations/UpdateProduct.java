package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProduct {

  public static void main(String[] args) {

    try {
      // create connection
      DbConn dbConn = new DbConn();
      Connection connection = dbConn.get();

      // create statement
      Statement stm = connection.createStatement();

      // 4. Execute query
      String updateQuery = "UPDATE products SET "
        + "name = 'Bluetooth Keyboard', "
        + "description = 'Slim wireless Bluetooth keyboard with rechargeable battery', "
        + "category = 'Electronics', "
        + "brand = 'KeyChron', "
        + "barcode = '9876543210987', "
        + "price = 2499.00, "
        + "discount = 15.00, "
        + "cost_price = 1800.00, "
        + "stock = 80 "
        + "WHERE id = 5000;";

      // create or update or delete executeUpdate
      int rowAffected = stm.executeUpdate(updateQuery);

      System.out.println(rowAffected + " Product updated successfully");

      stm.close();
      connection.close();
    } catch (SQLException ex) {
      System.out.println("Operation Error : update product failed : " +ex.getMessage());
    }
  }
}
