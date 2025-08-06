package jdbc.oprations;

import jdbc.conn.DbConn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FindSaveAndDeletedProduct {

  public static void main(String[] args) {

  try {
    // create connection
    DbConn dbConn = new DbConn();
    Connection connection = dbConn.get();

    // create statement
    CallableStatement callstm = connection.prepareCall("{ call FindSaveAndDeletedProduct(?) }");

    // set parameter
    callstm.setInt(1, 4900);

    // excute the stored procedure
    callstm.execute();

    System.out.println("Product deleted and saved to deleted_product successfully.");
  } catch (SQLException e) {
    throw new RuntimeException(e);
  }

  }
}
