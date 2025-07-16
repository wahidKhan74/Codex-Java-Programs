package exception;

import java.util.Scanner;
public class StringLengthCalculator {
  // String length calculator
  public static void  showStrLength(String name) {
    try {
      int length = name.length();
      System.out.println("Your Name has "+ length + " characters.");
    }  catch (NullPointerException e) {
      System.out.println("Invalid Name Please enter correct name...");
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    } catch (Exception e) {
      System.out.println("Invalid Name Please enter correct name...");
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("==============================");
    System.out.println("Welcome to Full Name length calculator");
    System.out.println("==============================");
    System.out.println("Enter your full name.");
    String name = scanner.nextLine();
    name = name.isEmpty() ? null : name;
    showStrLength(name);
  }
}
