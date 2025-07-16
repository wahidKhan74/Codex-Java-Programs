package array;

import java.util.Arrays;

public class ArrayTest {
  // Array is collection of multiple values
  // Similar types : int[]  , float[], byte[]
  // Array should be declared with fixed size

  public static void main(String[] args) {

    int[] numbers = {10, 20, 30, 40 ,50};  // array with values // initialized array
    float amounts[] = new float[5];  // empty array
    String[] ips = new String[5];

    amounts[0]=399.99f;
    amounts[1]=499.99f;
    amounts[2]=599.99f;
    amounts[3]=699.99f;
    amounts[4]=799.99f;
    // amounts[5]=899.99f;  // ArrayIndexOutOfBoundsException
    ips[0] ="192.168.1.7";
    ips[1] ="192.168.1.8";
    ips[2] ="192.168.1.9";

    System.out.println(Arrays.toString(amounts));
    System.out.println(Arrays.toString(ips));
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers[3]);
  }
}
