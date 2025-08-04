package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadProducts {

  public static void main(String[] args) {

    try {
      // create connection
      DbConn dbConn = new DbConn();
      Connection connection = dbConn.get();

      // create statement
      Statement stm = connection.createStatement();

      // 4. Execute query
      ResultSet rst = stm.executeQuery("SELECT * FROM wahid_store.products");

      while (rst.next()){
        System.out.println(
          "id : " + rst.getInt("id") +
            " name : " + rst.getString("name") +
            " price : " + rst.getDouble("price")
        );
      }

      rst.close();
      connection.close();
    } catch (SQLException ex) {
      System.out.println("Operation Error : DB connection failed.");
    }

  }
}
