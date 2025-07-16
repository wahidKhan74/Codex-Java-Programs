package Multithreading;
// WAP for joining thread where you are reading two files (01, 02) => write third => 03  (HW)
public class ReportGeneratorThreadJoin {
  public static void main(String[] args) {

    Thread dbFetch = new Thread(() -> {
      System.out.println("Fetching DB records...");
      try { Thread.sleep(1500); } catch (InterruptedException ignored) {}
      System.out.println("DB fetch done...");
    });

    Thread apiFetch = new Thread(() -> {
      System.out.println("Calling external API...");
      try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
      System.out.println("API fetch done...");
    });

    Thread generateReport = new Thread(() -> {
      try {
        dbFetch.join();
        apiFetch.join();
        System.out.println("Preparing Reports...");
        Thread.sleep(2000);
      } catch (InterruptedException ignored) {}
      System.out.println("Report completed...");
    });
    dbFetch.start();
    apiFetch.start();
    generateReport.start();

  }
}


