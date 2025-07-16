package exception;

import java.io.IOException;

public class ExceptionPropagation {

  void test_one() throws IOException {
    throw new IOException("Input Output Exception......");
  }

  void test_two() throws IOException {
    test_one();
  }

  void test_three() throws IOException {
    test_two();
  }

  void test_four() {
    try {
      test_two();
    } catch (IOException e) {
      System.out.println("Exception : "+e.getClass());
      System.out.println("Message : "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    ExceptionPropagation propagation = new ExceptionPropagation();
    propagation.test_four();
  }
}
