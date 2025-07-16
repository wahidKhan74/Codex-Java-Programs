package exception.methodovrr;

// Exception Handling with Method Overriding in Java
// Concept 1: If the superclass method declares an exception
//  1) Child can follow same signature to override ( Parent declare exception so the Child )
//  2) Child overridden method can or cannot declare the checked or Unchecked exception
//  3) If Super class has Checked Exception declared child can override it with unchecked exception.
//  4) If Super class has UnChecked Exception declared child cannot override it with unchecked exception.
import java.io.IOException;

class Super {

  public  void messageOne() throws IOException {
    throw new IOException("Super class io exception");
  }

  public  void messageTwo () throws RuntimeException{
    throw new RuntimeException("Super class exception");
  }
}

class Sub extends  Super{

  // 2) Child overridden method can or cannot declare the checked or unchecked exception
//  @Override  // Valid
//  public  void messageOne()  {
//    throw new RuntimeException("Child class exception");
//  }

  // 3) If Super class has Checked Exception declared child can override it with unchecked exception.
  @Override // Valid
  public  void messageOne()  throws  RuntimeException{
    throw new RuntimeException("Child class exception");
  }

  //  2) Child overridden method can or cannot declare the checked or unchecked exception
//  @Override  // Valid
//  public void messageTwo() {
//    throw new RuntimeException("Child class exception");
//  }

  // 4) If Super class has UnChecked Exception declared child cannot override it with unchecked exception.
//  @Override  // Not Valid
//  public void messageTwo() throws  IOException{
//    throw new RuntimeException("Child class exception");
//  }
}

public class TestExOvr2 {
  public static void main(String[] args) {
    try {
      Child child = new Child();
      child.messageOne();
      child.messageTwo();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
