package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest {

  public static void add(int num1 , int num2) {
    try {
      int result =  num1 + num2;
      System.out.println("Result : "+ result);
    } catch (Exception e) {
      System.out.println("Error : "+e.getClass());
      System.out.println("Error : "+e.getMessage());
    }
  }

  public static void sub(int num1 , int num2) {
    try {
      int result =  num1 - num2;
      System.out.println("Result : "+ result);
    } catch (Exception e) {
      System.out.println("Error : "+e.getClass());
      System.out.println("Error : "+e.getMessage());
    }
  }

  public static void reRun() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("==============================");
    System.out.println("Welcome to Mini Myni calculator");
    System.out.println("==============================");
    System.out.println("1. Add \n 2. Sub \n 3. Mul \n 4. Division");
    try {
      System.out.println("Select Option : ");
      int option = scanner.nextInt();
      System.out.println("Enter number1 : ");
      int number1 = scanner.nextInt();
      System.out.println("Enter number2 : ");
      int number2 = scanner.nextInt();

      switch (option) {
        case 1:
          add(number1, number2);
          break;
        case 2:
          sub(number1, number2);
          break;
        case 3:
          add(number1, number2);
          break;
        case 4:
          add(number1, number2);
          break;
        default:
          System.out.println("Invalid Option...");
          break;
      }
    } catch (InputMismatchException e){
      System.out.println("Only number values allowed..."+ e.getClass());
      reRun();
    } catch (ArithmeticException e){
      System.out.println("Only number values allowed..."+ e.getClass());
      reRun();
    } catch (Exception e){
      System.out.println("Only number values allowed..."+ e.getClass());
      reRun();
    }
  }

  public static void main(String[] args) {
    reRun();
  }
}
