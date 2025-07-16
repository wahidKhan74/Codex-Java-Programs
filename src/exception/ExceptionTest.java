package exception;

import java.util.Scanner;

public class ExceptionTest {

  public static void calculate() {
    try {
      int result  = 200/0;
    } catch (Exception e) {
      System.out.println("Error : "+e.getClass());
      System.out.println("Error : "+e.getMessage());
      System.out.println("Program Line 5");
    }
  }

  public static void division() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number1 : ");
    int number1 = scanner.nextInt();
    System.out.println("Enter number2 : ");
    int number2 = scanner.nextInt();
    try {
      int result  = number1/number2;
      System.out.println("The Division is : "+ result);
    } catch (Exception e) {
      System.out.println("Error : "+e.getClass());
      System.out.println("Error : "+e.getMessage());
      System.out.println("Program Line 5");
    }
  }

  public static void addition(int num1, int num2) {
    try {
      int result  = num1 + num2;
      String strResult = result +"abc";
      double result2 = Double.parseDouble(strResult);
      System.out.println("Result : "+result2);
    } catch (Exception e) {
      System.out.println("Error : "+e.getClass());
      System.out.println("Error : "+e.getMessage());
      System.out.println("Program Line 5");
    } finally {
      System.out.println("Cleanup ....");
    }
  }

  public static void main(String[] args) {

    System.out.println("Program Line 1");
    System.out.println("Program Line 2");
    System.out.println("Program Line 3");
    System.out.println("Program Line 4");

//    calculate();
//    division();
    try {
      addition(1000, 4000);
    }catch (Exception e) {

    }

    System.out.println("Program Line 6");
    System.out.println("Program Line 7");
    System.out.println("Program Line 8");
    System.out.println("Program Line 9");
    System.out.println("Program Line 10");
  }
}
