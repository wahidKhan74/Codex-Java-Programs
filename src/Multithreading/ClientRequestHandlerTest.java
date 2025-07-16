package Multithreading;

class ClientRequest implements  Runnable{

  private int clientId;

  public ClientRequest(int clientId) {
    this.clientId = clientId;
  }

  @Override
  public void run() {
    System.out.println("Handling client #" + clientId);
    try { Thread.sleep(2000); } catch (InterruptedException e) {}
    System.out.println("Finished client #" + clientId);
  }
}


public class ClientRequestHandlerTest {
  public static void main(String[] args) {

    Thread th01 = new Thread(new ClientRequest((2010)));
    th01.start();

    Thread th02 = new Thread(new ClientRequest((2012)));
    th02.start();

    new Thread(new ClientRequest((2015))).start();

    // create dynamic threads
    for (int i = 1; i <= 5; i++) {
      new Thread(new ClientRequest((i))).start();
    }
  }
}
