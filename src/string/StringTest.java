package string;

public class StringTest {

  // String is collection of characters
  String password = "Alzohar@123";  // string literal
  String getPassword = new String("Abc@1234");   // string with new keyword

  public static void main(String[] args) {
    StringTest stringTest = new StringTest();
    System.out.println(stringTest.password);
    System.out.println(stringTest.getPassword);
  }

}
