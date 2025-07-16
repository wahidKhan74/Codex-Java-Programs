package oops.encapsulation;

// BankAccount Encapsulated Class
public class BankAccount {
  //private data variables
  private long accountNumber;
  private String accountName;
  private double balance;
  private Address address;

  // public get and set methods
  public long getAccountNumber() {
    return this.accountNumber;
  }
  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "BankAccount { " +
      "accountNumber=" + accountNumber +
      ", accountName='" + accountName + '\'' +
      ", balance=" + balance +
      ", address=" + address +
      " }";
  }
}
