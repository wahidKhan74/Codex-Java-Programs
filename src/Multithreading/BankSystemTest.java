package Multithreading;

class FundTransfer extends Thread {
  private String fromAccount;
  private String toAccount;
  private double amount;

  public FundTransfer(String from, String to, double amt) {
    this.fromAccount = from;
    this.toAccount = to;
    this.amount = amt;
  }

  @Override
  public void run() {
    System.out.println("Transferring $" + amount + " from " + fromAccount + " to " + toAccount);
    // Simulate transaction delay
    try { Thread.sleep(1000); } catch (InterruptedException e) {}
    System.out.println("Transfer complete!" + this.getName());
  }
}

public class BankSystemTest {
  public static void main(String[] args) {

    FundTransfer th01 = new FundTransfer("Ac0102034", "Ac0102440", 5000);
    th01.start();
    FundTransfer th02 = new FundTransfer("Ac0102014", "Ac0102442", 5000);
    th02.start();
    FundTransfer th03 = new FundTransfer("Ac0102044", "Ac0102446", 5000);
    th03.start();
  }
}
