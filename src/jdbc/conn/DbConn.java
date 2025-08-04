package jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

  private final String dbUrl = "jdbc:mysql://localhost:3306/wahid_store";
  private final String userName ="root";
  private final String password = "root";

  Connection connection = null;

  // create connection
  public DbConn() {
    try{
      // 1. Register Driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      // 2. Create connection
      connection = DriverManager.getConnection(dbUrl, userName, password);
    } catch (Exception ex) {
      System.out.println("Connection Error : DB connection failed.");
    }
  }

  // get connection
  public Connection get() {
    return connection;
  }

  // close connection
  public void close() {
    if(connection!=null) {
      try {
        connection.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
