package accmod;

class Home {

  int people = 1;
  String name = "Devil's Home";

  void showHome() {
    System.out.println("Home name : "+ name);
    System.out.println("No people : "+ people);
  }
}

public class DefaultTest {

  public static void main(String[] args) {

    Home home = new Home();
    System.out.println("Home name : "+ home.name);
    System.out.println("No people : "+ home.people);
    home.showHome();
  }
}
