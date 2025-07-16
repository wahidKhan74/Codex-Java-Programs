package array;

import java.util.Arrays;

public class StringArray {

  public static void main(String[] args) {
    String[] names = new String[20];
    // add dynamic values in array
    for (int index=0; index<20; index++){
      names[index] = "user_"+index;
    }

    System.out.println(Arrays.toString(names));

    // read values from array
    for(int index=0; index<names.length; index++){
      System.out.println(names[index]);
    }

    // Adding or Reading more than the size of array lead to array index out of bound exception.
  }

  public static class Main2 {
    public static void main(String[] args) {
      System.out.println("---------------------------");
      System.out.println("Today is good day !");
      System.out.println("---------------------------");
      System.out.println("Tomorrow is ParleG !");
      System.out.println("---------------------------");
    }
  }
}
