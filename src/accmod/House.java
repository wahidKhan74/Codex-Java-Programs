package accmod;

public class House {

  protected int houseArea = 3000;
  protected byte noOfChilds = 3;
  protected String houseName = "Antilia House.";

  protected void showHouseArea() {
    System.out.println("House Area : "+ houseArea);
  }

  public void showAll() {
    System.out.println("House Name : "+ houseName);
    System.out.println("House Area : "+ houseArea);
    System.out.println("No of Childs : "+ noOfChilds);
  }

}

//public class ProtectedTest {
//
//  public static void main(String[] args) {
//
//    House house = new House();
//
//    System.out.println("House Name : "+ house.houseName);
//    System.out.println("House Area : "+ house.houseArea);
//    System.out.println("No of Childs : "+ house.noOfChilds);
//
//    house.showHouseArea();
//    house.showAll();
//  }
//}
