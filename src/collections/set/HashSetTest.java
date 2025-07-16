package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

  public static void main(String[] args) {
    // Stores unique values , No insertion order , Not Thread safe
    Set<String> emails = new HashSet<>();

    emails.add("john@example.com");
    emails.add("alice@example.com");
    emails.add("john@example.com"); // duplicate, will be ignored
    emails.add("naina@example.com");
    emails.add("aslaf@example.com");

    System.out.println(emails);


    for (String email : emails) {
      System.out.println(email);
    }
  }
}
