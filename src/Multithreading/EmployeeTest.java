package Multithreading;

// 2. Create a thread by implementing Runnable interface
class Employee implements Runnable {

  @Override
  public void run() {
    System.out.println("Employee thread is running ....");
  }
}


public class EmployeeTest {

  public static void main(String[] args) {

    // create object
    Employee employee01 = new Employee();
    //create thread
    Thread  empTh01 = new Thread(employee01);
    empTh01.start();

    Thread empTh02 = new Thread(new Employee());
    empTh02.start();

    Thread empTh03 = new Thread(new Employee());
    empTh03.start();

    Thread empTh04 = new Thread(new Employee());
    empTh04.start();
  }


}
