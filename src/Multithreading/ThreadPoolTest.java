package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.
public class ThreadPoolTest {

  public static void main(String[] args) {
    // Create a thread pool with 2 threads
    ExecutorService executor = Executors.newFixedThreadPool(2);

    //Submit task using lambda
    executor.submit(()->{
      System.out.println("Tasks 01 is running "+ Thread.currentThread().getName());
    });
    executor.submit(()->{
      System.out.println("Tasks 02 is running "+ Thread.currentThread().getName());
    });
    executor.submit(()->{
      System.out.println("Tasks 03 is running "+ Thread.currentThread().getName());
    });
    executor.submit(()->{
      System.out.println("Tasks 04 is running "+ Thread.currentThread().getName());
    });

    executor.shutdown();
  }
}
