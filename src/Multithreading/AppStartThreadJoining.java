package Multithreading;
//In Java, the Thread.join() method is used when one thread needs to wait for the completion of another thread before proceeding.
public class AppStartThreadJoining {

  public static void main(String[] args) throws InterruptedException {

    Thread th01 = new Thread(()->{
      System.out.println("Loading resources...");
      try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
      System.out.println("Resources loaded...");
    });
    th01.start();

    //join main thread with th01
    try { th01.join(); } catch (InterruptedException ignored) {}

    System.out.println("The main method logic....");
  }
}
