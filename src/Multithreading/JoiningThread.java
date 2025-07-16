package Multithreading;
// The join() method in Java is provided by the java.lang.Thread
// one thread to wait until the other thread to finish its execution.
public class JoiningThread {
  public static void main(String[] args) {
    Thread th01 = new Thread(()->{
      System.out.println("Transaction thread th01 ...");
    });

    Thread th02 = new Thread(()->{
      System.out.println("Transaction thread th02 ...");
    });
    Thread th001 = new Thread(()->{
      try {
        th01.join();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Transaction debit fees thread th01 ...");
    });

    Thread th002 = new Thread(()->{
      try {
        th02.join();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Transaction debit fees thread th02 ...");
    });
    th01.start();
    th02.start();
    th001.start();
    th002.start();
  }
}
