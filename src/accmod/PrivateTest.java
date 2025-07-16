package accmod;

class BackAccount {
  // properties
  private double balanceAmount = 4546754.56;
  private long accountNumber = 938377373;
  private String ifscCode = "HDFC0053";
  //method
  private double showBalace() {
    return balanceAmount;
  }
  private void showAccountNumber() {
    System.out.println("Account Number : "+ accountNumber);
  }
  public void showDetails() {
    System.out.println("Account Number : "+ accountNumber);
    System.out.println("Account Balance : "+ balanceAmount);
    System.out.println("Account IFSC : "+ ifscCode);
  }

} //class

public class PrivateTest {

  public static void main(String[] args) {
    //create object
    BackAccount backAccount = new BackAccount();
    // System.out.println(backAccount.balanceAmount);  // 'balanceAmount' has private access in 'accmod. BackAccount'
    // System.out.println(backAccount.accountNumber);  // 'accountNumber' has private access in 'accmod. BackAccount'
    // backAccount.showAccountNumber();
    backAccount.showDetails();
  }

}
