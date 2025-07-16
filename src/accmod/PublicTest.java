package accmod;

class Property {
  // data members
  public String parkName = "Public Park";
  public int parkRoads = 3;
  public double parkArea = 3000.30;
  // methods
  public void showPark() {
    System.out.println("Welcome to '"+parkName+"'.");
  }
  public void showAll() {
    System.out.println("Welcome to '"+parkName+"'.");
    System.out.println("Number of roads : "+parkRoads);
    System.out.println("Area of roads : "+parkArea);
  }
}

public class PublicTest {
  public static void main(String[] args) {
    // create an object of PropertyTest
    Property propertyTest = new Property();
    System.out.println("Park Name : "+propertyTest.parkName);
    System.out.println("Park Roads : "+propertyTest.parkRoads);
    System.out.println("Park Area : "+propertyTest.parkArea);
    propertyTest.showPark();
    propertyTest.showAll();
  }
}
