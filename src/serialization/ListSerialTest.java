package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListSerialTest {


  public static void writeList(List<TvSerial>  tvSerials) {
    try {
      System.out.println("Started file writing....");
      // create stream and write the object
      FileOutputStream fout  = new FileOutputStream("tv-data.txt");

      // Object stream
      ObjectOutputStream out = new ObjectOutputStream(fout);

      // writeObject will perform conversion from object to byte stream.
      out.writeObject(tvSerials);

      out.close();
      System.out.println("Completed file writing....");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void readList() {
    try {
      System.out.println("Started file reading....");
      // create stream and read the object
      FileInputStream finp = new FileInputStream("tv-data.txt");

      // creat object input stream
      ObjectInputStream stream = new ObjectInputStream(finp);

      // readObject will perform conversion from byte stream to object.
      List<TvSerial>  tvSerials = (List<TvSerial>) stream.readObject();

      System.out.println(tvSerials);

      stream.close();
      System.out.println("Completed file reading....");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  public static void main(String[] args) {

    List<TvSerial>  tvSerials = new ArrayList<>();

    tvSerials.add(new TvSerial("Breaking Bad", "Crime", new Date()));
    tvSerials.add(new TvSerial("Game of Thrones", "Fantasy", new Date()));
    tvSerials.add(new TvSerial("Friends", "Comedy", new Date()));
    tvSerials.add(new TvSerial("Stranger Things", "Sci-Fi", new Date()));
    tvSerials.add(new TvSerial("The Office", "Comedy", new Date()));

    writeList(tvSerials);
    readList();
  }
}
