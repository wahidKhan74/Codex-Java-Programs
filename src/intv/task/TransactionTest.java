package intv.task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Transaction {

  private String userId;
  public int transactionAmount;

  public Transaction(String userId, int transactionAmount) {
    this.userId = userId;
    this.transactionAmount = transactionAmount;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public int getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(int transactionAmount) {
    this.transactionAmount = transactionAmount;
  }
}

public class TransactionTest {

  public static void main(String[] args) {

    List<Transaction> transactionList = List.of(
      new Transaction("user1", 8000),
      new Transaction("user2", 400),
      new Transaction("user3", 200),
      new Transaction("user4", 700),
      new Transaction("user5", 20),
      new Transaction("user2", 200),
      new Transaction("user2", 300),
      new Transaction("user3", 700)
    );

    Map<String, List<Integer>> groupedTransactions =
      transactionList.stream().collect(Collectors.groupingBy(
      Transaction::getUserId, Collectors.collectingAndThen(
        Collectors.toList(),
        list -> list.stream()
          .map(Transaction::getTransactionAmount)
          .sorted(Comparator.reverseOrder())
          .limit(2)
          .collect(Collectors.toList())
      )
    ));

    groupedTransactions.forEach((userId, topAmount )-> {
      System.out.println(userId + " : "+ topAmount);
    });
  }


}


//Input : List<Transaction> is there and Transaction object has the userId and transactionAmount
//
//Output : Need to get the list of the userIds along with top two transaction amounts(big transactions amounts) of each user