package oops.encapsulation;
// Address Encapsulated Class
public class Address {
  private String street;
  private String city;
  private String state;
  private String country;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Address {" +
      "street='" + street + '\'' +
      ", city='" + city + '\'' +
      ", state='" + state + '\'' +
      ", country='" + country + '\'' +
      " }";
  }
}
