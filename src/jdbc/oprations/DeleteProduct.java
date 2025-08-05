package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProduct {

  public static void main(String[] args) {

    try {
      // create connection
      DbConn dbConn = new DbConn();
      Connection connection = dbConn.get();

      // create statement
      Statement stm = connection.createStatement();

      // 4. Execute query
      String deleteQuery = "DELETE FROM products WHERE id = 5000;";

      // create or update or delete executeUpdate
      int rowAffected = stm.executeUpdate(deleteQuery);

      System.out.println(rowAffected + " Product deleted successfully");

      stm.close();
      connection.close();
    } catch (SQLException ex) {
      System.out.println("Operation Error : delete product failed : " +ex.getMessage());
    }
  }
}
