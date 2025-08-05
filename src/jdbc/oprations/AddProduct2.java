package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddProduct2 {

  public static void main(String[] args) {

    try {
      // create connection
      DbConn dbConn = new DbConn();
      Connection connection = dbConn.get();

      // 4. Execute query
      String insertQuery = "INSERT INTO products "
        + "(id, name, description, category, brand, barcode, price, discount, cost_price, stock) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      // create statement
      PreparedStatement pstmt = connection.prepareStatement(insertQuery);

      // set value
      pstmt.setInt(1, 5002);
      pstmt.setString(2, "Xenon Wireless Mouse");
      pstmt.setString(3, "Ergonomic wireless mouse with long battery life and fast response time.");
      pstmt.setString(4, "Electronics");
      pstmt.setString(5, "LogiTech");
      pstmt.setString(6, "1234567890123");
      pstmt.setDouble(7, 1299.00);
      pstmt.setDouble(8, 10.00);
      pstmt.setDouble(9, 800.00);
      pstmt.setInt(10, 150);

      // create or update or delete executeUpdate
      int rowAffected = pstmt.executeUpdate();

      System.out.println(rowAffected + " Product created successfully");

      pstmt.close();
      connection.close();
    } catch (SQLException ex) {
      System.out.println("Operation Error : Add product failed : " +ex.getMessage());
    }
  }
}
