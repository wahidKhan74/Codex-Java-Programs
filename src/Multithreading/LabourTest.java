package Multithreading;

// 1. Create Thread via extends Thread Class
class Labour extends Thread {
  String name;

  Labour(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println("Labour is working with "+ this.name);
  }
}


public class LabourTest {
  public static void main(String[] args) {
    // create thread
    Labour labour01 = new Labour("labour-01");
    labour01.start();

    Labour labour02 = new Labour("labour-02");
    labour02.start();

    Labour labour03 = new Labour("labour-03");
    labour03.start();

    Labour labour04 = new Labour("labour-04");
    labour04.start();

    Labour labour05 = new Labour("labour-05");
    labour05.start();
  }

}
