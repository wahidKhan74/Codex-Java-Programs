package oops.encapsulation;
// Encapsulation in Java is a process of wrapping code and data together into a single unit.
// In encapsulation, you hide data variable (private) and provide access via public methods.
// Encapsulation helps to protect data and controlled access to it.
// Java Beans or Encapsulated Classes or Models or Entities
public class EncapsulationTest {
  public static void main(String[] args) {

    Address address = new Address();
    address.setStreet("Jo Street");
    address.setCity("Pulgaon");
    address.setState("Maharashtra");
    address.setCountry("India");

    BankAccount bankAccount = new BankAccount();
    bankAccount.setAccountNumber(20203030);
    bankAccount.setAccountName("John Snow");
    bankAccount.setBalance(49454.45);
    bankAccount.setAddress(address);

    System.out.println(bankAccount);

    System.out.println(bankAccount.getAccountNumber());
    System.out.println(bankAccount.getAccountName());
    // city
    System.out.println(bankAccount.getAddress().getCity());
    System.out.println(bankAccount.getAddress().getCountry());

  }
}
// WAP for encusulation of College -> nameOfCollege, noOfStudent, noOfTeacher, Address -> stret,city,state
// WAP for encusulation Order -> id, totalPrice, User-> name, email, phoneNumber ,  Product -> name,price,size , Address -> stret,city,state