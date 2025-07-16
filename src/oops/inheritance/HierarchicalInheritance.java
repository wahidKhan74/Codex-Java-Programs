package oops.inheritance;
// Hierarchical Inheritance :  When two or more classes inherits a single class, it is known as hierarchical inheritance.
// One parent multiple children
class Animal{
  void eat(){
    System.out.println("eating...");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("barking...");
  }
}

class Cat extends Animal{
  void meow(){
    System.out.println("meowing...");
  }
}

public class HierarchicalInheritance {
  public static void main(String[] args) {


    Dog dog = new Dog();
    dog.eat();
    dog.bark();

    Cat cat = new Cat();
    cat.eat();
    cat.meow();
  }
}
