package collections.list;

import java.util.List;
import java.util.Stack;

// Stack is a subclass of Vector and represents a Last-In-First-Out (LIFO) data structure.
// It is thread-safe, meaning multiple threads can access one at a time it without corrupting the data.
// Maintains insertion order.
// Allows duplicate elements.
// Can store null values.
// Default initial capacity = 10
// If the capacity is exceeded, the new capacity = old capacity × 2
public class StackTest {
  public static void main(String[] args) {

    List<String> coinStack = new Stack<String>();

    coinStack.add("1$ coin");
    coinStack.add("10$ coin");
    coinStack.add("5$ coin");
    coinStack.add("2$ coin");
    coinStack.add("1$ coin");
    coinStack.add("5$ coin");

    System.out.println(coinStack);

    for (String coin : coinStack) {
      System.out.println(coin);
    }
  }
}
