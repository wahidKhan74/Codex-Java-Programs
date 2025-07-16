package oops.inheritance;

class Grandfather{
  void eat(){
    System.out.println("eating...");
  }
}

class FatherOne extends Grandfather{
  void work(){
    System.out.println("working...");
  }
}
class ChildOne extends FatherOne{
  void sleep(){
    System.out.println("sleeping...");
  }
}
class ChildTwo extends FatherOne{
  void moreSleep(){
    System.out.println("more sleeping...");
  }
}

public class HybridInheritance {
  public static void main(String[] args) {
    ChildOne childOne = new ChildOne();

    childOne.eat();
    childOne.work();
    childOne.sleep();
  }
}
