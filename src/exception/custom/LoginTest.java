package exception.custom;

public class LoginTest {
  static String userName = "admin";
  static String password = "pass@123";

  public static void login (String userName, String password) throws UserNotFoundException {
    if(userName.equals(LoginTest.userName)) {
      if(password.equals(LoginTest.password)) {
        System.out.println("Login Sucessfull!");
      } else{
        // throwing exception : Runtime
        throw new InvalidCredException("Invalid Credential");
      }
    } else {
      // throwing exception : Compile
      throw new UserNotFoundException("User not found.");
    }
  }

  public static void main(String[] args) {
    try {
      login("admi1n", "pass@123");
    } catch (UserNotFoundException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }

  }
}
