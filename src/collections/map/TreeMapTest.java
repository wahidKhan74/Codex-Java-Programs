package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

  public static void main(String[] args) {

    //TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
    Map<String, String> mapOfCountries = new TreeMap<String, String>();

    mapOfCountries.put("India", "+91");
    mapOfCountries.put("USA", "+1");
    mapOfCountries.put("United Kingdom", "+44");
    mapOfCountries.put("Canada", "+1");
    mapOfCountries.put("Australia", "+61");
    mapOfCountries.put("Germany", "+49");
    mapOfCountries.put("France", "+33");
    mapOfCountries.put("Brazil", "+55");
    mapOfCountries.put("Japan", "+81");
    mapOfCountries.put("China", "+86");
    mapOfCountries.put("Russia", "+7");
    mapOfCountries.put("South Africa", "+27");
    mapOfCountries.put("Saudi Arabia", "+966");
    mapOfCountries.put("UAE", "+971");
    mapOfCountries.put("Singapore", "+65");
    mapOfCountries.put("Pakistan", "+92");
    mapOfCountries.put("Bangladesh", "+880");
    mapOfCountries.put("Nepal", "+977");
    mapOfCountries.put("Sri Lanka", "+94");
    mapOfCountries.put("New Zealand", "+64");

    System.out.println(mapOfCountries);

    System.out.println("----------------");

    for (Map.Entry record : mapOfCountries.entrySet()) {
      System.out.println(record.getKey() +" : "+ record.getValue());
    }

    System.out.println("----------------");

  }
}
