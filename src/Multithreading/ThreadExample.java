package Multithreading;
// Thread : A light weighted sub process is called thread.
// 1. Create Thread via extends Thread Class
// 2. Create a thread by implementing Runnable interface

class MyThread extends Thread {

  // Override the run method to define the task for the thread
  @Override
  public  void run() {
    // logic for thread
    System.out.println("Thread is running ....");
  }
}
public class ThreadExample {

  public static void main(String[] args) {
    // Create a thread
    MyThread threadOne = new MyThread();
    MyThread threadTwo = new MyThread();
    MyThread threadThree = new MyThread();
    MyThread threadFour = new MyThread();

    // start the thread
    System.out.println(threadOne.getName());
    threadOne.start();

    System.out.println(threadTwo.getName());
    threadTwo.start();
    threadThree.start();
    threadFour.start();
  }
}
