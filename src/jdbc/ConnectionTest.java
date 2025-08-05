package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionTest {

  private final static String dbUrl = "jdbc:mysql://localhost:3306/wahid_store";
  private final static String userName ="root";
  private final static String password = "root";

  static Connection connection = null;
  static Statement stm = null;

  public static void main(String[] args) {
    try {
      // 1. Register Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 2. Create connection
      connection = DriverManager.getConnection(dbUrl, userName, password);
      System.out.println("Connection created successfully.");
      // 3. Create Statement
      stm = connection.createStatement();
      System.out.println("Statement created successfully.");
      // 4. Execute query
      boolean rst = stm.execute("SELECT * FROM products");
      System.out.println("Executed query : "+ rst);

    } catch (ClassNotFoundException ex ) {
      System.out.println("Connection Error : Class No found.");
    } catch (SQLException ex) {
      System.out.println("Connection Error : DB connection failed.");
    } finally {
      // 5. close connection
      if(stm!=null) {
        try {
          stm.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
      if(connection!=null) {
        try {
          connection.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
