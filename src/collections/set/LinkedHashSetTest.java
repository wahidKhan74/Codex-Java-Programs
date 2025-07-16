package collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

  public static void main(String[] args) {

    // LinkedList and Unique values , Yes insertion order is preserve , No Thread safe
    LinkedHashSet<String> setOfCities = new LinkedHashSet<>();

    setOfCities.add("Paris");
    setOfCities.add("London");
    setOfCities.add("New York");
    setOfCities.add("Paris"); // duplicate
    setOfCities.add("Mumbai");
    setOfCities.add("Pune");

    System.out.println(setOfCities);

    setOfCities.remove("Pune");

    for (String city : setOfCities) {
      System.out.println(city);
    }
  }
}
