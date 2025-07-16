package Multithreading;

public class DaemonThreadTest {
  public static void main(String[] args) {

    Thread th01 = new Thread(() -> {
      System.out.println("Thread th01...");
      try { Thread.sleep(1500); } catch (InterruptedException ignored) {}
      if(!Thread.currentThread().isDaemon()) {
        System.out.println("Done th01...");
      }
    });

    Thread th02 = new Thread(() -> {
      System.out.println("Thread th02...");
      try { Thread.sleep(1500); } catch (InterruptedException ignored) {}
      System.out.println("Done th02...");
    });

    Thread th03 = new Thread(() -> {
      System.out.println("Thread th03...");
      try { Thread.sleep(1500); } catch (InterruptedException ignored) {}
      System.out.println("Done th03...");
    });

    // Set th01 as deamon thread.
    th01.setDaemon(true);
    th01.start();
    th02.start();
    th03.start();
  }
}
