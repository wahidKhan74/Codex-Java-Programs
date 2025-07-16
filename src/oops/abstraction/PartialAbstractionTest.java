package oops.abstraction;
// Partial Abstraction : Abstract class
// An abstract class must be declared with an abstract keyword.
// abstract method (empty body) + concrete method (method with implement)

abstract class CentralHospital {
  // specification
  abstract void clockIn();
  abstract void clockOut();

  // concrete method
  void submitReports(String timeLine) {
    System.out.println("Submit Reports "+timeLine);
  }
}
class NainaHospital extends CentralHospital {
  @Override
  void clockIn() {
    System.out.println("Employee clockIn : 7am");
  }
  @Override
  void clockOut() {
    System.out.println("Employee clockOut : 7pm");
  }
}
class TaufeekHospital extends CentralHospital{
  @Override
  void clockIn() {
    System.out.println("Employee clockIn : 9am");
  }
  @Override
  void clockOut() {
    System.out.println("Employee clockOut : 9pm");
  }
}
public class PartialAbstractionTest {
  public static void main(String[] args) {
    NainaHospital nainaHospital = new NainaHospital();
    nainaHospital.clockIn();
    nainaHospital.clockOut();
    nainaHospital.submitReports("Weekly");

    TaufeekHospital taufeekHospital = new TaufeekHospital();
    taufeekHospital.clockIn();
    taufeekHospital.clockOut();
    taufeekHospital.submitReports("Monthly");
  }
}
