package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

  public static void readFile(String filename) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
    } catch (FileNotFoundException e) {
      System.out.println(filename + " File does not exist ...");
    } catch (IOException e) {
      System.out.println("Issue while reading file");
    }
  }

  public static void main(String[] args) {
    readFile("data.txt");
    readFile("data1.txt");
  }
}
