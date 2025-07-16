package exception;

import java.io.IOException;

// Throws : In Java, the throws keyword is used to explicitly declare an exception.
public class ThrowsTest {

  static String userName = "admin";
  static String password = "pass@123";

  public static void login (String userName, String password) throws IOException {
    if(userName.equals(ThrowTest.userName)) {
      if(password.equals(ThrowTest.password)) {
        System.out.println("Login Sucessfull!");
      } else{
        // throwing exception
        throw new IOException("Invalid Credential");
      }
    } else {
      throw new IOException("User not found.");
    }
  }

  public static void main(String[] args) {
    try {
      login("admi1n", "pass@123");
    } catch ( IOException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }

  }
}
