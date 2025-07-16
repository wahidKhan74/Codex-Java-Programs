package classes;

public class Test {
  // A class is a blueprint to create object
  // Class is wrapper to bind data members and member function together

  int data1 = 100;  // data members
  int data2 = 200;

  // members function
  void add() {
    int result = data1 + data2;
    System.out.println("result : "+result);
  }

  void sub() {
    int result = data1 - data2;
    System.out.println("result : "+result);
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.add();
    test.sub();
  }
}
