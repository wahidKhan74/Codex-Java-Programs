package oops.inheritance;

interface Super1 {
  // declare abstract/empty body methods
  public void task();
  public void work();
}

interface Super2 {
  // declare abstract/empty body methods
  public void task();
}

class Subclass implements  Super1, Super2 {
  // implementation or override
  public void task(){
    System.out.println("Task completed");
  }

  public void work() {
    System.out.println("Work completed");
  }
}

public class MultipleInheritanceTest {
  public static void main(String[] args) {
    Subclass subclass = new Subclass();
    subclass.task();
    subclass.work();
  }
}
