package Multithreading;

class ScreenRecorder implements Runnable{

  @Override
  public void run() {
    System.out.println("Thread logic running ...");
  }
}
public class ThreadRunnable {

  public static void main(String[] args) {

    // Created thread with A class implementing Runnable interface
    Thread th01 = new Thread(new ScreenRecorder());
    th01.start();


    // Created thread with A anonymous class which is implementing Runnable interface
    Thread th02 = new Thread(new Runnable(){
      @Override
      public void run() {
        System.out.println("Thread logic running ...");
      }
    });
    th02.start();

    // Create a thread with lambda expression : It represents the instances of functional interfaces (interfaces with a single abstract method).
    // Lambda expressions in Java, introduced in Java SE 8.
    Thread th03 = new Thread(()-> {
      System.out.println("Thread 3 logic running ...");
    });
    th03.start();
  }
}
