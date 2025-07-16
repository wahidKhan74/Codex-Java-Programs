package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set interface is part of the Collection Framework and represents a collection of unique elements
public class SetExample {

  Set<String> setOfName = new HashSet<>();  // Hashed values , No insertion order , No Thread safe
  Set<String> setOfCars = new LinkedHashSet<>(); // LinkedList and Hashed values , Yes insertion order , No Thread safe
  Set<String> setOfPhones = new TreeSet<>();  // Tree and Hashed values ,You can sort the order , No Thread safe
}
