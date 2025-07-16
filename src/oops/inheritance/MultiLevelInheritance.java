package oops.inheritance;
// When there is a chain of inheritance, it is known as multilevel inheritance
// Class C  -> Class B -> Class A
class GrandFather {
  public String familyName = "Stark";

  public String getFamilyName() {
    return familyName;
  }
}

class Father extends  GrandFather{
  public String middleName ="Miller";

  public String getMiddleName() {
    return middleName;
  }
}

class Children extends  Father {
  public String firstName ="John";

  public String getFirstName() {
    return firstName;
  }
}

public class MultiLevelInheritance {

  public static void main(String[] args) {
    Children children = new Children();
    System.out.println("The FullName : "+ children.firstName + " "+ children.middleName + " "+ children.familyName);

    children.getFirstName();
    children.getMiddleName();
    children.getFamilyName();
  }
}
