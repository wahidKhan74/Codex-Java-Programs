package collections.list;

// Java ArrayList :
// 1) ArrayList is List type of collection,
// 2) ArrayList Allow ordered or indexed data element : Maintains Insertion Order
// 3) and also allow duplicates values
// 4) ArrayList is Non-Synchronized : Multiple thread can operate an arraylist ( Not thread safe)

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Internally, ArrayList uses an array of Object[] to store elements.
// ArrayList can grow as needed (unlike regular arrays).
// Resizable-array implementation of the List interface.
// Implements all optional list operations, and permits all elements, including null
// Constructs an empty list with an initial capacity of 10.
// Capacity 1.5x growth
// Time Complexity : Access (get/set) O(1) constant/ideal time complexity.
// Time Complexity : Access (add middle / remove) O(n) linear time complexity.
// Search: 	O(n) linear time complexity.
public class JavaArrayList {
  public static void main(String[] args) {

    List<String> listOfGames = new ArrayList<String>();

    listOfGames.add("Call of duty");
    listOfGames.add("God of wars");
    listOfGames.add("PubG");
    listOfGames.add("Clash of Clans");
    listOfGames.add("Call of duty");
    listOfGames.add("PubG");

    System.out.println(listOfGames);

    // first
    System.out.println(listOfGames.get(0));

    //list
    System.out.println(listOfGames.get(listOfGames.size() - 1));

    System.out.println("---------------------------");

    // iteration : Traversing list through Iterator
    Iterator<String> iterator = listOfGames.iterator(); // getting the Iterator
    while (iterator.hasNext()) {  // check if iterator has the elements
      System.out.println(iterator.next());   //printing the element and move to next
    }

    //Traversing list through for-each loop
    for (String game : listOfGames) {
      System.out.println(game);
    }

  ArrayList<String> listOfNames = new ArrayList<>();
  listOfNames.add("sample");
  ListIterator<String> listIterator = listOfNames.listIterator();

  //  By Iterator interface.
  //  By for-each loop.
  //  By ListIterator interface.
  //  By for loop.
  //  By forEach() method.
  //  By forEachRemaining() method.

}
}
