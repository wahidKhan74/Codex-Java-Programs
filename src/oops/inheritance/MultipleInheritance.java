package oops.inheritance;

// One child => Two/Multi Parents
// Multiple Inheritance A class's capacity to inherit traits from several classes is referred to as multiple inheritances.
// This notion may be quite helpful when a class needs features from many sources.
// Java does not support multiple inheritance with classes.
class Parent1 {
  public void task() {
    System.out.println("Tast Given");
  }
}

class Parent2 {
  public void task() {
    System.out.println("Tast Given");
  }
}

// Error : A class cannot extends multiple classes
//class Son extends Parent1, Parent2 {
//  public void work() {
//    System.out.println("Work Given");
//  }
//}


public class MultipleInheritance {
  public static void main(String[] args) {

  }
}
