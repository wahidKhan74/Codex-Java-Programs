package Multithreading;
//A component of Java that decides which thread to run or execute
// and which thread to wait is called a thread scheduler in Java.
// There are two factors for scheduling a thread i.e. Priority (1 to 10) and Time of arrival.

class CarManufacture extends  Thread{

  String processId;
  String process;
  CarManufacture(String processId, String process){
    this.processId = processId;
    this.process = process;
  }

  @Override
  public void run() {
//    System.out.println(process + " is started by process id "+processId);
    // Thread.sleep is used to create delay
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {}
    System.out.println(process +" finished process #" + processId);
  }
}

public class ThreadScheduler {

  public static void main(String[] args) {

    CarManufacture  th01 =  new CarManufacture("P01023", "Painting");
    CarManufacture  th02 =  new CarManufacture("P01010", "Designing");
    CarManufacture  th03 =  new CarManufacture("P01012", "Fitting");
    CarManufacture  th04 =  new CarManufacture("P01050", "Quality Check");

    //Priority: Priority of each thread lies between 1 to 10.
    // If a thread has a higher priority, it means that thread
    // has got a better chance of getting picked up by the thread scheduler.

    // schedule thread priority
    th02.setPriority(Thread.MAX_PRIORITY);  // 10
    th01.setPriority(Thread.NORM_PRIORITY);  // 5
    th03.setPriority(Thread.NORM_PRIORITY);
    th04.setPriority(Thread.MIN_PRIORITY);  // 1

    th02.start();
    // IllegalThreadStateException  : Can we start a thread twice => No
    // th02.start();


    th01.start();
    th03.start();
    th04.start();

  }


}
