package collections.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
  String name;
  int age;
  double salary;

  public Employee(String name, int age, double salary) {
    this.name = name; this.age = age; this.salary = salary;
  }

  public String toString() {
    return name + " - " + salary;
  }
}

public class StreamEmployeeTest {

  public static void main(String[] args) {

    List<Employee> employees = Arrays.asList(
      new Employee("Alice", 30, 50000),
      new Employee("Bob", 45, 60000),
      new Employee("Charlie", 25, 40000),
      new Employee("David", 35, 55000)
    );

    // Filter employees with salary > 50000
    List<Employee> filteredSal = employees.stream().filter((emp) -> emp.salary > 50000).toList();
    System.out.println(filteredSal);

    // Filter employees with age <= 30
    List<Employee> filerAge = employees.stream().filter((emp) -> emp.age <= 30).toList();
    System.out.println(filerAge);

    // Get Names of All Employees
    List<String> nameList =   employees.stream().map((emp)-> emp.name).toList();
    System.out.println(nameList);

    // Sort by Salary Descending
    List<Employee> revsedSal = employees.stream().sorted(Comparator.comparingDouble((emp) -> -emp.salary)).toList();
    System.out.println(revsedSal);

    //Find Highest Paid Employee
    List<Employee> highestSal =  revsedSal.stream().limit(1).toList();
    System.out.println(highestSal);

    // Find Lowest Paid Employee
    List<Employee> lowestSal = employees.stream().sorted(Comparator.comparingDouble((emp) -> emp.salary)).limit(1).toList();
    System.out.println(lowestSal);

    // Calculate Average Salary
    double avgSal = employees.stream().mapToDouble((emp) -> emp.salary).average().orElse(0);
    System.out.println("Avg sal : "+ avgSal);

    // Join All Employee Names into a Single String
    String joinName = employees.stream().map( (emp)-> emp.name ).collect(Collectors.joining(" , "));
    System.out.println("Names  : "+ joinName);
  }
}
