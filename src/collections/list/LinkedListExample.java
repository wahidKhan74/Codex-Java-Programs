package collections.list;
import java.util.LinkedList;
import java.util.List;
// Java LinkedList class uses a doubly linked list to store the elements.
// LinkedList class maintains insertion order.
// LinkedList class can contain duplicate elements.
// LinkedList class is non synchronized (Not thread safe)
// LinkedList class, manipulation is fast because no shifting needs to occur.
// Time complexity : get(index)	: O(n):  Needs to traverse from head or tail
// Time complexity : add(E) : 	O(1) : 	At the end (tail), if using addLast()
// LinkedList no need to allocate an initial size or capacity.
// LinkedList is implemented as a doubly linked list, it does not use an internal array.
public class LinkedListExample {

  public static void main(String[] args) {

    LinkedList<String> listOfBikes = new LinkedList<>();

    listOfBikes.add("Pulsar 125");
    listOfBikes.add("MT 15");
    listOfBikes.add("R1 5");
    listOfBikes.add("Duke");
    listOfBikes.add("GT 615");
    listOfBikes.add("Royal enfield");

    // O(1) : 	At the start (head node)
    listOfBikes.addFirst("Shine");
    // O(1) : 	At the edd (tail node)
    listOfBikes.addLast("Jawa");
    System.out.println(listOfBikes);
    System.out.println(listOfBikes.get(4));

    //iteration
  }
}
