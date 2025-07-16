package array;

import accmod.House;

public class ProtectedDemo extends  House{

  public static void main(String[] args) {

    ProtectedDemo house = new ProtectedDemo();

    System.out.println("House Name : "+ house.houseName);
    System.out.println("House Area : "+ house.houseArea);
    System.out.println("No of Childs : "+ house.noOfChilds);

    house.showAll();
    house.showHouseArea();
  }
}
