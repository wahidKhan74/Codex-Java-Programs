package session.task;

import java.util.Collections;
import java.util.List;

public class City {

  private final int id;
  private final String name;
  private final String country;
  private final List<Integer> ratings;

  public City(int id, String name, String country, List<Integer> ratings) {
    this.id = id;
    this.name = name;
    this.country = country;
    this.ratings = ratings;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCountry() {
    return country;
  }

  public List<Integer> getRatings() {
    return Collections.unmodifiableList(ratings);  // read only list
  }

  public void addRating(int rating) {
    ratings.add(rating);
  }


  public double getAvgRating() {
    return ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
  }

  @Override
  public String toString() {
    return "City { " +
      "id=" + id +
      ", name='" + name + '\'' +
      ", country='" + country + '\'' +
      ", Avg Rating=" + getAvgRating() +
      '}';
  }
}
