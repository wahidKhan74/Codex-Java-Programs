package collections.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Streams API is used for processing a pipeline of operations on collections.
// Introduced in Java 8.

public class StreamTest {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("Aslaf","Alex", "Naina", "Vijay","Amar", "Charlse","Kim" ,"Atif", "Aslaf");

    // Group names staring with "A"
    // Filter
    Set<String> uniqueName = names.stream().filter((n) -> n.startsWith("A")).collect(Collectors.toSet());
    System.out.println(uniqueName);


    List<Integer> numbers = Arrays.asList(10, 10, 20, 30, 40, 50, 61, 77, 87,93);
    List<Integer> evenList = numbers.stream().filter((num) -> num % 2 == 0).toList();
    System.out.println(evenList);

    // Map
    List<String> words = Arrays.asList("hello", "world");
    List<String> upperList = words.stream().map((wrd) -> wrd.toUpperCase()).toList();
    System.out.println(upperList);

    // sorted(), distinct(), limit(), skip()

    List<Integer> sortedNumbers = numbers.stream().sorted().toList();
    System.out.println(sortedNumbers);

    List<Integer> sortedFive = numbers.stream().sorted().limit(5).toList();
    System.out.println(sortedFive);

    List<Integer> sortedSkip3andLimit5 = numbers.stream().sorted().skip(3).limit(5).toList();
    System.out.println(sortedSkip3andLimit5);

    List<Integer> sortedSkipLast3 = numbers.stream().sorted(Comparator.reverseOrder()).skip(3).sorted().toList();
    System.out.println(sortedSkipLast3);

    List<Integer> distict = numbers.stream().sorted(Comparator.reverseOrder()).skip(3).distinct().sorted().toList();
    System.out.println(distict);

    // reduce
    List<Integer> amounts = List.of(100, 200, 300, 400, 5000);
    int sum = amounts.stream().reduce(0, (a, b) -> a + b);
    System.out.println("Sum = " + sum); // Output: 15

    int max = amounts.stream().reduce(Integer::max).orElseThrow();
    System.out.println("Max = " + max); // Output: 5000
  }
}
