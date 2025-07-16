package varaible;

public class StaticVariable {

  //  A variable that is declared as static is called a static variable.
  static double accountBalance = 86456.4545;  // instance variable
  static double depositAmount = 101010; // instance variable

  public static void main(String[] args) {

    System.out.println("Total Balance : "
      + (StaticVariable.accountBalance + StaticVariable.depositAmount)
    );
  }
}
