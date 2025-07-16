package collections.set.checkin;

import java.util.Objects;

public class Employee {

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
    return "Employee{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", salary=" + salary +
      '}';
  }

  // Only ID used for uniqueness
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;
    Employee emp = (Employee) o;
    return id == emp.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
