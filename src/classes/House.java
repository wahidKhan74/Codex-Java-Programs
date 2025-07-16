package classes;

public class House {
  // data members  or properties or class variables
  int noRoom = 4;
  short noKitchen = 1;
  byte noWashRoom = 4;
  String houseName = "Mannat";
  byte noFloor = 0;
  boolean liftExist = false;
  // member function  or methods
  void showRoom() {
    System.out.println("House has "+noRoom +" rooms");
  }
  void showKitchen() {
    System.out.println("House has "+noKitchen +" kitchen");
  }

  void showAll() {
    System.out.println(houseName + " House has following details :");
    System.out.println("Room : "+noRoom);
    System.out.println("Kitchen : "+noKitchen);
    System.out.println("WashRoom : "+noWashRoom);
    System.out.println("Floor : "+noFloor);
    System.out.println("List Exist : "+liftExist);
  }

  public static void main(String[] args) {
    House house = new House();
    house.showAll();
    house.showKitchen();
    house.showRoom();
  }
}
