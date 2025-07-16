package oops.abstraction;
// Abstraction process will hide the implementation details and showing only functionality to the user.
// Abstraction will only give specification and guidelines.
// 1. 100% oops.abstraction (interface) or // 2. Partial oops.abstraction (abstract class).

interface ReserveBank {
  void rateOfInterest(double principal, int year);  // Every bank should give some rate of interest
  void maximumDeposit();  // Every bank should restrict the daily deposit amount
  void minimumBalance();  // Every bank should have minimum balance criteria
}

// implementation class
class HDFCBank implements ReserveBank {

  @Override
  public void rateOfInterest(double principal, int year) {
    int interest = 7;
    System.out.println("Hdfc bank interest : "+(principal*year*interest)/100);
  }

  @Override
  public void maximumDeposit() {
    System.out.println("Hdfc bank...");
  }
  @Override
  public void minimumBalance() {
    System.out.println("Hdfc bank...");
  }
}

class SBIBank implements ReserveBank {
  @Override
  public void rateOfInterest(double principal, int year) {
    int interest = 5;
    System.out.println("SBI bank interest : "+(principal*year*interest)/100);
  }
  @Override
  public void maximumDeposit() {
    System.out.println("SBI bank...");
  }
  @Override
  public void minimumBalance() {
    System.out.println("SBI bank...");
  }
}

public class AbstractionTest {
  public static void main(String[] args) {
    // create object
    HDFCBank hdfcBank = new HDFCBank();
    hdfcBank.rateOfInterest(15000, 2);

    SBIBank sbiBank = new SBIBank();
    sbiBank.rateOfInterest(15000, 2);

  }
}
