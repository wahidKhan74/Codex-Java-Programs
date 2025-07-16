package varaible;

public class Variables {

  public static void main(String[] args) {
    // Variable : is temp storage to store values
    // Numeric types
    byte smallNumber = 70;  // -2^(n-1)  to 2^(n-1)-1  // -128 to 127
    short shortNumber = 30; // 2 bytes // -32768 to 32767
    int number = 10888886;  // 4 byte
    long bigNumber = 232323L; // 8 bytes

    //decimal type
    float amount = 123.34f;  // 4 byte
    double bigAmount = 3434.434; // 8 byte

    // non numeric
    boolean isMarried = true;
    char gender = 'M';

    System.out.println("Numeric data types");
    System.out.println("smallNumber " + smallNumber);
    System.out.println("shortNumber " + shortNumber);
    System.out.println("number " + number);
    System.out.println("amount " + amount);
    System.out.println("bigAmount " + bigAmount);

    System.out.println("isMarried " + isMarried);
    System.out.println("gender " + gender);

  }
}
