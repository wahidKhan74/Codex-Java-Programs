package oops.inheritance;

// inheritance : It is concept when one object acquires all the properties and behaviors of a parent object.
// Is a relation - Actual Inheritance - Parent - Child
// Has a relation - Object based relation - No Parent - Child

class Parent  {
  // properties declaration
   public String familyName;
   public double money;
   public boolean isSingular;

   Parent(String familyName, double money, boolean isSingular) {
     // properties initialization
     this.familyName = familyName;
     this.money = money;
     this.isSingular = isSingular;
   }

   public void showAll() {
     System.out.println(
       "Hello, "+ familyName + " family" + " Assets : "+ money + " and it is singular family : "+ isSingular
     );
   }
}

class Child extends Parent{

  public String fullName;
  public int age;
  public char gender;

  Child(String fullName, int age, char gender, String familyName, double money, boolean isSingular) {
    // initialize parent class properties
    super(familyName, money, isSingular);
    // initialize sub class properties
    this.fullName = fullName;
    this.age = age;
    this.gender = gender;
  }

  public void showDetail() {
    System.out.println(
      "Hello, "+ familyName + " family" + " Assets : "+ money + " and it is singular family : "+ isSingular +" \n"
      +" fullName is "+fullName + "  age is "+ age +" gender is "+ gender
    );
  }
}


public class InheritanceTest {
  public static void main(String[] args) {

    Child child = new Child("Waheed Mohammed", 32, 'M',  "Khan", 5000000, true);

    child.showAll();
    System.out.println("---------------------");
    child.showDetail();
  }
}
