package collections.set;

import java.util.TreeSet;

public class TreeSetTest {

  public static void main(String[] args) {

    // Tree and Unique values , You can sort the order , No Thread safe
    // Default sorted set in natural order
    TreeSet<String> students = new TreeSet<>();

    students.add("Wahid");
    students.add("Riya");
    students.add("Aarav");
    students.add("Wahid");

    System.out.println(students);  // [Aarav, Riya, Wahid] - sorted
  }
}
