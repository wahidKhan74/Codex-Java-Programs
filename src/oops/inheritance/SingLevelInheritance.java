package oops.inheritance;
// When a class inherits another class, it is known as a single inheritance.
// Class B  -> Class A
class Employee {
  public String salary ="5000";

  public void showSalary() {
    System.out.println("Salary : "+ salary);
  }
}

// SingleLevel : Developer -> Employee
class Developer extends  Employee {
  public String name = "John Snow";

  public void showName() {
    System.out.println("Developer Name : "+ name);
  }
}

// SingleLevel : Operator -> Employee
class Operator extends  Employee {
  public String name = "John Kim";

  public void showName() {
    System.out.println("Operator Name : "+ name);
  }
}


public class SingLevelInheritance {
  public static void main(String[] args) {


    Developer developer = new Developer();
    developer.showName();
    developer.showSalary();

    System.out.println("------------------------");
    Operator operator = new Operator();
    operator.showName();
    operator.showSalary();
  }
}
