package datatypes;

public class TypeConv {
  // Type converting (also called type casting) refers to converting a variable from one data type to another.
  // Implicit TypeCasting (Widening) : Auto type cast : Low range value to High range
  // byte => short => int => long => float => double
  static byte byteNumber = 70;// 1 byte :: -128 to 127
  static short shortNumber = byteNumber; // 2 byte
  static int intNumber = shortNumber;  // 4 byte
  static long bigNumber = intNumber;  // 8 byte
  static float amount = bigNumber;
  static double bigAmount = bigNumber;
  static double conAmount = amount;

  // Explicit TypeCasting (Narrowing) : No Auto type cast : High range value to low range

  // double => float => long => int => shot => byte
  static int numericValue = (int) bigNumber;
  static short smallValue = (short) intNumber;
  static byte byteValue =  (byte) bigNumber;
  float moneyAmount = (float) bigAmount;

  public static void main(String[] args) {

    System.out.println("-- Numeric data types --");
    System.out.println("byteNumber " + byteNumber);
    System.out.println("shortNumber " +shortNumber);
    System.out.println("intNumber " +intNumber);
    System.out.println("bigNumber " +bigNumber);

    System.out.println("-- Numeric data types After conv --");
    System.out.println("numericValue " + numericValue);
    System.out.println("smallValue " +smallValue);
    System.out.println("byteValue " +byteValue);
  }
}
