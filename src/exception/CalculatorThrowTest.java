package exception;

public class CalculatorThrowTest {

  public static void add(int num1, int num2) {
    if(num1> 0 && num2>0) {
      System.out.println("Addition : "+(num1+ num2));
    } else{
      throw new ArithmeticException("Negative number addition not allowed.");
    }
  }

  public static void sub(int num1, int num2) {
    if(num1> 0 && num2>0 && num1> num2) {
      System.out.println("Subtraction : "+(num1 - num2));
    } else{
      throw new ArithmeticException("Negative number subtraction not allowed.");
    }
  }

  public static void main(String[] args) {
    try {
      add(1000, 2000);
      System.out.println("-------");
      add(-100, 2000);
      System.out.println("ignored stm -------");
      add(1000, 2000);
    } catch (ArithmeticException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }

    try {
      sub(10000, 2000);
      System.out.println("-------");
      sub(-100, 2000);
      System.out.println("ignored stm -------");
      sub(1000, 2000);
    } catch (ArithmeticException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }
  }
}
