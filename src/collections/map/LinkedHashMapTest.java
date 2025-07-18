package collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

  public static void main(String[] args) {

    // LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
    Map<Integer, String> mapOfStudents = new LinkedHashMap<Integer, String>();

    // put values
    mapOfStudents.put(1010, "John Smith");
    mapOfStudents.put(1011, "Janny Smith");
    mapOfStudents.put(1012, "Mike Smith");
    mapOfStudents.put(1013, "Will Smith");
    mapOfStudents.put(1014, "David Smith");
    mapOfStudents.put(1015, "Juaa Smith");


    //print
    System.out.println(mapOfStudents);

    System.out.println("----------------");

    // iterator over map
    Set set = mapOfStudents.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()){
      Map.Entry record = (Map.Entry) iterator.next();
      System.out.println(record.getKey() +" : "+ record.getValue());
    }

    System.out.println("----------------");

    for (Map.Entry record : mapOfStudents.entrySet()) {
      System.out.println(record.getKey() +" : "+ record.getValue());
    }

    System.out.println("----------------");
    // Checking if a student ID exists in the HashMap
    int idToCheck = 1014;
    boolean exists = mapOfStudents.containsKey(idToCheck);
    System.out.println("Student with ID " + idToCheck + " exists in records: " + exists);
  }
}
