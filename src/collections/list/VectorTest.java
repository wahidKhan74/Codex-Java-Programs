package collections.list;

import java.util.List;
import java.util.Vector;

// They are legacy classes but still used in some scenarios.
// Vector is a synchronized, dynamic array that can grow or shrink in size.
// It is thread-safe, meaning multiple threads can access one at a time it without corrupting the data.
// Maintains insertion order.
// Allows duplicate elements.
// Can store null values.
// Default initial capacity = 10
// If the capacity is exceeded, the new capacity = old capacity × 2
public class VectorTest {

  public static void main(String[] args) {

    List<String> listOfTodo = new Vector<String>();

    // add elements
    listOfTodo.add("Training");
    listOfTodo.add("Practise");
    listOfTodo.add("Recording");
    listOfTodo.add("Gym");

    System.out.println(listOfTodo);

    for(String task : listOfTodo) {
      System.out.println(task);
    }

  }
}
