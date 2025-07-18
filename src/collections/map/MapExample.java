package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// The map interface in Java is a structure that holds a set of key-value pairs
// where each key is unique and points to one value only.
public class MapExample {

  public static void main(String[] args) {

    // HashMap is the implementation of Map, but it doesn't maintain any order.
    Map<String, String> mapOfCities = new HashMap<String, String>();

    // LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
    Map<String, String> mapOfWords = new LinkedHashMap<String, String>();

    //TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
    Map<String, String> mapOfCountries = new TreeMap<String, String>();
  }
}
