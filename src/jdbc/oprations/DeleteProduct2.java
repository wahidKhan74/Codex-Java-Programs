package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProduct2 {

  public static void main(String[] args) {

    try {
      // create connection
      DbConn dbConn = new DbConn();
      Connection connection = dbConn.get();

      // 4. Execute query
      String deleteQuery = "DELETE FROM products WHERE id = ?";

      // create statement
      PreparedStatement pstmt = connection.prepareStatement(deleteQuery);

      // set id
      pstmt.setInt(1, 4999);

      // create or update or delete executeUpdate
      int rowAffected = pstmt.executeUpdate();

      System.out.println(rowAffected + " Product deleted successfully");

      pstmt.close();
      connection.close();
    } catch (SQLException ex) {
      System.out.println("Operation Error : delete product failed : " +ex.getMessage());
    }
  }
}
