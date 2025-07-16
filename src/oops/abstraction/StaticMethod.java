package oops.abstraction;
// Since Java 8, we can have static methods in the interface.
interface Spacecraft {
  void launch();
  void land();

  static void performMission() {
    System.out.println("Perform Spacecraft (static) method...");
  }
}

class Satellite implements  Spacecraft {

  @Override
  public void launch() {
    System.out.println("Launch Satellite ...");
  }

  @Override
  public void land() {
    System.out.println("Landing Satellite ...");
  }
}

class Rocket implements Spacecraft {

  @Override
  public void launch() {
    System.out.println("Launch Rocket ...");
  }

  @Override
  public void land() {
    System.out.println("Land Rocket ...");
  }
}

public class StaticMethod {
  public static void main(String[] args) {


    Spacecraft  spacecraft = new Satellite();
    spacecraft.launch();
    Spacecraft.performMission();
    spacecraft.land();

    Spacecraft  spacecraft2 = new Rocket();
    spacecraft2.launch();
    Spacecraft.performMission();
    spacecraft2.land();
  }
}
