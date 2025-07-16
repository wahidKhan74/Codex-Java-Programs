package collections;
// The Collection in Java is a framework that provides an architecture to store and manipulate a group of objects.
// Java Collection means a single unit representing a group of objects.
// List, Set, Queue, MAP, Tree

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

  public static void main(String[] args) {

    // List of Cities
    List<String> listOfCities = new ArrayList<String>();

    // add element in the list
    listOfCities.add("New York");
    listOfCities.add("Mumbai");
    listOfCities.add("Nagpur");
    listOfCities.add("Capetown");
    listOfCities.add("Delhi");


    // remove a element from list
    listOfCities.remove(2);

    // print entire list
    System.out.println(listOfCities);

    // get one element by index
    System.out.println(listOfCities.get(3));
    // System.out.println(listOfCities.get(5));

    // Iterating through list
    listOfCities.forEach((element)->{
      System.out.println("City : "+ element);
    });

    System.out.println("----------------------");

    // Iterating through list
    for (int index=0; index<listOfCities.size(); index++){
      System.out.println("City : "+ listOfCities.get(index));
    }
  }


}
