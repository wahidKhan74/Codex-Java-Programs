package collections.map;

import java.util.*;

class Transaction {

  private String type;
  private double amount;

  public Transaction(String type, double amount) {
    this.type = type;
    this.amount = amount;
  }

  @Override
  public String toString() {
    return type + " ₹" + amount;
  }
}

public class TransactionHistoryTest {

  public static void main(String[] args) {

    // Show transaction history per customer
    Map<String, List<Transaction>> transactions = new LinkedHashMap<>();

    List<Transaction> ts = new ArrayList<Transaction>();
    ts.add(new Transaction("Deposit",45456));
    ts.add(new Transaction("Withdraw",500));
    ts.add(new Transaction("Deposit",45600));

    transactions.put("CUST100", ts);

    transactions.put("CUST101", Arrays.asList(
      new Transaction("Deposit",50000),
      new Transaction("Withdraw",45456),
      new Transaction("Deposit",500000),
      new Transaction("Withdraw",45456)
    ));

    System.out.println("Transactions of CUST001: " + transactions.get("CUST001"));
    System.out.println("Transactions of CUST001: " + transactions.get("CUST101"));
  }
}
