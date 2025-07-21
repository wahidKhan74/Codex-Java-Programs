package serialization;
// Serialization is a process of converting an object's state into a byte stream.
// It is mainly used in File and storage reading and writing.

import java.io.*;
import java.util.Date;

class TvSerial implements Serializable {

  public String id;
  public String name;
  public Date time;

  public TvSerial(String id, String name, Date time) {
    this.id = id;
    this.name = name;
    this.time = time;
  }

  @Override
  public String toString() {
    return "TvSerial { " +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", time=" + time +
      '}';
  }
}

public class SerialTest {


  public static void serializeObject() {
    try {
      TvSerial tvSerial = new TvSerial("S10203C", "Balika Vadhu", new Date());

      System.out.println("Started file writing....");
      // create stream and write the object
      FileOutputStream fout  = new FileOutputStream("data.txt");

      // Object stream
      ObjectOutputStream out = new ObjectOutputStream(fout);

      // writeObject will perform conversion from object to byte stream.
      out.writeObject(tvSerial);

      out.close();
      System.out.println("Completed file writing....");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void deSerializeObject() {
    try {
      System.out.println("Started file reading....");
      // create stream and read the object
      FileInputStream finp = new FileInputStream("data.txt");

      // creat object input stream
      ObjectInputStream stream = new ObjectInputStream(finp);

      // readObject will perform conversion from byte stream to object.
      TvSerial serialTv = (TvSerial) stream.readObject();

      System.out.println(serialTv);

      stream.close();
      System.out.println("Completed file reading....");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    serializeObject();
    System.out.println("------------------");
    deSerializeObject();
  }
}
