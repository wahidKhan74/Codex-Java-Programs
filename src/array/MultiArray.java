package array;

import java.util.Arrays;

public class MultiArray {

  public static void main(String[] args) {
    // Multidimensional array : Store data in multiple values / store data in rows and columns
    // A multidimensional array is array of arrays where each element can be an array itself.

    int[][] table = new int[5][5];
//    table[0][0] = 10;
//    table[0][1] = 20;
//    table[0][2] = 30;

    for (int outerIndex = 0; outerIndex<5; outerIndex++){
      for (int innerIndex=0 ; innerIndex<5; innerIndex++){
        table[innerIndex][outerIndex] = innerIndex*outerIndex;
      }
    }

    System.out.println(table[4][4]);
    for (int outerIndex = 0; outerIndex<5; outerIndex++){
      for (int innerIndex=0 ; innerIndex<5; innerIndex++){
        System.out.print(table[innerIndex][outerIndex] + " ");
      }
      System.out.println();
    }

  }

}
