package exception;
// Throw  : In Java, the throw keyword is used to explicitly throw an exception
public class ThrowTest {

  static String userName = "admin";
  static String password = "pass@123";

  public static void login (String userName, String password) {
    if(userName.equals(ThrowTest.userName)) {
      if(password.equals(ThrowTest.password)) {
        System.out.println("Login Sucessfull!");
      } else{
        // throwing exception
        throw new RuntimeException("Invalid Credential");
      }
    } else {
      throw new RuntimeException("User not found.");
    }
  }

  public static void main(String[] args) {
    System.out.println("Start of the program... ");
    try {
//      login("admin", "pass@123");
      login("admin12", "pass@123");
    } catch (RuntimeException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }
    System.out.println("End of the program... ");
  }
}
