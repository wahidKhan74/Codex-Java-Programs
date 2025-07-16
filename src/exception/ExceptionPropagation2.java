package exception;

import java.io.IOException;

public class ExceptionPropagation2 {

  void test_one()  {
    throw new RuntimeException("Runtime Exception......");
  }

  void test_two() {
    test_one();
  }

  void test_three() {
    test_two();
  }

  void test_four() {
    try {
      test_three();
    } catch (RuntimeException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    ExceptionPropagation2 propagation = new ExceptionPropagation2();
    propagation.test_four();
  }
}
