package collections.list;

import java.util.*;

public class ListExample {
  public static void main(String[] args) {
    // List collection
    ArrayList<String> listOfNames = new ArrayList<>();
    LinkedList<String> listOfCities = new LinkedList<>();
    Vector<String> listOfFruits = new Vector<>();
    Stack<String> listOfAnimals = new Stack<>();


    // List collection  : This syntax : Flexibility / swap‑ability
    // Without touching the rest of your code. With the first form you’d have to rewrite the left‑hand side.
    List<String> listOfCars = new ArrayList<>();
    List<String> listOfBikes = new LinkedList<>();
    List<String> listOfAccounts = new Vector<>();
    List<String> listOfGames = new Stack<>();

  }
}
