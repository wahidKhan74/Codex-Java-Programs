package varaible;

public class InstanceVariable {
  // A variable declared inside the class but outside the body of the method, is called an instance variable.
  // A variable belong to  object/instance of a class.
  double accountBalance = 86456.4545;  // instance variable
  double depositAmount = 101010; // instance variable

  public static void main(String[] args) {

    // create instance of class
    InstanceVariable object = new InstanceVariable();

    System.out.println("Total Balance : " + (object.accountBalance + object.depositAmount));
  }

}
