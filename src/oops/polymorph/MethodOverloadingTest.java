package oops.polymorph;
// Method Overloading in Java ::
//  Defining several methods in a class having the same name but with different parameters lists.

class Learning {

  public void learn(){
    System.out.println("This is a generic learning!");
  }

  public void learn(String type){
    System.out.println("This is a "+type+" learning!");
  }

  public int learn(String type, String goal){
    System.out.println("This is a "+type+" learning for "+ goal);
    return 0;
  }

  public void learn(String type, int hours){
    System.out.println("This is a "+type+" learning for "+ hours + " hours");
  }
}

public class MethodOverloadingTest {
  public static void main(String[] args) {
    // create object
    Learning learning = new Learning();

    learning.learn();
    learning.learn("Online");
    learning.learn("Offline", "Java Polymorphism");
    learning.learn("Self Learning", 4);
  }
}
