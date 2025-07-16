package collections;

import java.util.ArrayList;
import java.util.List;

class Employee {
  public int id;
  public String name;
  public double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "\n {" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", salary=" + salary + " "+
      '}' ;
  }
}

public class EmployeeList {

  public static void main(String[] args) {

    Employee employee1 = new Employee(100, "Alex Miller", 354467.45);
    Employee employee2 = new Employee(101, "John Miller", 98766.89);

    List<Employee> listOfEmployee = new ArrayList<Employee>();

    // add employees
    listOfEmployee.add(employee1);
    listOfEmployee.add(employee2);
    listOfEmployee.add(new Employee(102, "John Snow", 654546.67));
    listOfEmployee.add(new Employee(103, "Jenny Snow", 651122.67));
    listOfEmployee.add(new Employee(104, "Taufeek Sheikh", 99999.67));

    System.out.println(listOfEmployee);
    System.out.println("------------");
    listOfEmployee.forEach((employee) -> {
      System.out.println(employee.id +" : "+ employee.name);
    });
  }
}


// WAP for creating list of Students, BankAccount, HomeDevices