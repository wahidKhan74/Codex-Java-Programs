package constructor;

public class ConstTest {
  public static void main(String[] args) {

    // create an object
    Animal animal = new Animal("Tiger", 5);
    System.out.println("Animal Name : "+animal.name);
    System.out.println("Animal Age : "+animal.age);

  }
}

class Animal {

  // properties
  public String name;
  public int age;

  // 1. default constructor : zero paramterised constructor
  Animal() {}

  // 2. parametrised constructor
  Animal(String name) {
      this.name = name;
  }

  Animal(String name , int age) {
    this.name = name;
    this.age = age;
  }
}