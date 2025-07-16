package oops.abstraction;

interface  Payment {
  void pay(double amount);
}
// Implement UPI payment  : use upiId for payment
// Implement Credit / debit card payment  : credit / debit card details
// Implement Wallet payment : use app wallet for payment

class UPIPayment implements  Payment {
  public String upiId ;
  public double upiBalance ;

  public UPIPayment(String upiId, double upiBalance) {
    this.upiBalance = upiBalance;
    this.upiId = upiId;
  }

  @Override
  public void pay(double amount) {

  }
}
public class PaymentImplementation {
}
