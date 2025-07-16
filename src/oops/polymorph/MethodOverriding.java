package oops.polymorph;

// Method Overriding : If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
// Method Overriding will happen in child and parent class and method signature should same.

class Bank  {

  public double balance;

  public void deposit(double amount) {
    balance = balance + amount;  // balance+=amount;
    System.out.println("The new bank account balance is : "+ balance);
  }

  public void withdraw(double amount) {
    balance = balance - amount;  // balance-=amount;
    System.out.println("The updated bank account balance is : "+ balance);
  }

  public void withdraw2(double amount) {
    balance = balance - amount;  // balance-=amount;
    System.out.println("The updated bank account balance is : "+ balance);
  }
}

class ATM extends Bank {

  // Overriding
  @Override
  public void deposit(double amount) {
    double atmFee = 40d;
    balance = ( balance +  amount )- atmFee ;  // balance+=amount;
    System.out.println("The new bank account balance is : "+ balance);
  }

  @Override
  public void withdraw(double amount) {
    double atmFee = 40d;
    balance = ( balance -  amount ) - atmFee ;  // balance+=amount;
    System.out.println("The updated bank account balance is : "+ balance);
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    ATM atm = new ATM();
    atm.balance = 50000;
    atm.withdraw(10000);
    atm.deposit(10000);
  }
}
