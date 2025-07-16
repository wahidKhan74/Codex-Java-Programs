package exception.methodovrr;

// Exception Handling with Method Overriding in Java
// Concept 1: If the superclass method does not declare an exception
//  1) Child can follow same signature to override ( Parent does not declare exception so the Child )
//  2) Child overridden method cannot declare the checked exception
//  3) but Child can declare unchecked exception.
import java.io.IOException;

class Parent {

  public  void messageOne() {
    throw new RuntimeException("Super class exception");
  }

  public  void messageTwo() {
    throw new RuntimeException("Super class exception");
  }
}

class Child extends  Parent{

  // 2) Child overridden method cannot declare the checked exception
//  @Override   // Not Valid
//  public  void messageOne() throws IOException{
//    throw new RuntimeException("Child class exception");
//  }

  //  3) but Child can declare unchecked exception.
  @Override
  public  void messageTwo() throws  RuntimeException{
    throw new RuntimeException("Child class exception");
  }
}

public class TestExOvr {
  public static void main(String[] args) {
    Child child = new Child();
    child.messageTwo();
  }
}
