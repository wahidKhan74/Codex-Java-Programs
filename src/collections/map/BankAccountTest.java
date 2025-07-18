package collections.map;

import java.util.HashMap;
import java.util.Map;

class BankAccount{
  private String accountNumber;
  private String accountHolder;
  private double balance;

  public BankAccount(String accountNumber, String accountHolder, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return accountHolder + " (Balance: ₹" + balance + ")";
  }
}


public class BankAccountTest {

  public static void main(String[] args) {
    // Usage
    Map<String, BankAccount> accounts = new HashMap<>();

    accounts.put("ACC123", new BankAccount("ACC123", "Wahid Khan", 15000.0));
    accounts.put("ACC456", new BankAccount("ACC456", "John Doe", 24500.0));

    System.out.println("Account ACC456: " + accounts.get("ACC456"));

    System.out.println("Account ACC456: " + accounts.get("ACC466"));
  }
}
