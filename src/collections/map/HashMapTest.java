package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

  public static void main(String[] args) {

    // HashMap is the implementation of Map, but it doesn't maintain any order.
    Map<String, Long> phoneBook = new HashMap<String, Long>();

    // add elements
    phoneBook.put("Atif", 9176543231L);
    phoneBook.put("Taufeek", 9376543231L);
    phoneBook.put("Aslaf", 9476543231L);
    phoneBook.put("Naina", 9576543231L);
    phoneBook.put("Wahid", 9776543231L);

    // print
    System.out.println(phoneBook);

    // remove
    System.out.println(phoneBook.remove("Wahid"));

    System.out.println(phoneBook.containsKey("Aslaf"));

    System.out.println("----------------");

    // iterator over map
    Set set = phoneBook.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()){
      Map.Entry record = (Map.Entry) iterator.next();
      System.out.println(record.getKey() +" : "+ record.getValue());
    }

    System.out.println("----------------");

    for (Map.Entry record : phoneBook.entrySet()) {
      System.out.println(record.getKey() +" : "+ record.getValue());
    }

  }
}
