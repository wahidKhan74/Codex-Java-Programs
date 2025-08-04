package session.task;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    // Read all steps before starting to implement:
    // 1. For this Exercise use as basis this Session class in an IDE of your choice

    // 2. Create a City class with an unique id, a name, a country and an ordered collection of Ratings (integer's).
    // - Create a method to add new ratings to a city
    // - Change of other values of the city should not be possible after creation.

    // 3. Create Instances of your Class from the inputString (the String format is fixed as is)
    // - Store the cities in a manner that allows access based on the id

    // 4. Finally, print the Cities sort by average rating starting with the highest value.
    // - Display name, country and the average rating.

    // 5. If you have time, add a ToDo for the next steps


public class Session {

  static String inputString = "(Hamburg, Germany, [2,3,4]); (Chennai, India, [5,3,7,4]); (Singapore, Singapore, [2,3]); (New York, USA, [4,3,8,7])";


  public static void main(String[] args) {

    List<City> cities = new ArrayList<>();
    int idCounter = 1;

    // splits string
    String[] entries =  inputString.split("\\);");

    for(String entry: entries) {
      // skip empty list
      if (entry.trim().isEmpty()) continue;

      // add closing ')' if missing
      if (!entry.endsWith(")")) entry += ")";

      Pattern pattern = Pattern.compile("\\(([^,]+),\\s*([^,]+),\\s*\\[(.*?)\\]\\)");
      Matcher matcher = pattern.matcher(entry.trim());

      if (matcher.find()) {
        try {
          String name = matcher.group(1).trim();
          String country = matcher.group(2).trim();
          String rating = matcher.group(3).trim();

//       System.out.println(name);
//       System.out.println(country);
//       System.out.println(rating);

          //Note :: Added after the interview call to test  :: add element to list

          List<Integer> ratings = new ArrayList<>();
          if (!rating.isEmpty()) {
            for (String r : rating.split(",")) {
              ratings.add(Integer.parseInt(r.trim()));
            }
          }

          cities.add(new City(idCounter++, name, country, ratings));

        } catch (Exception e) {
          System.err.println("Failed to parse: " + entry);
        }
      }
    }
    // sort the list based on average ::
    cities.sort((c1, c2) -> Double.compare(c2.getAvgRating(), c1.getAvgRating()));

    System.out.println("\nCities sorted by average rating:");
    cities.forEach(city ->  System.out.println(
      city.getName() + ", " + city.getCountry() + " - Average Rating: " + city.getAvgRating()
    ));
  }
}
