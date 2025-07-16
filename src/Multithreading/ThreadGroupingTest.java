package Multithreading;

class Hero implements Runnable {
  String name;
  public Hero(String name) {
    this.name = name;
  }
  @Override
  public void run() {
    System.out.println("Hero is running .."+ name);
  }
}
public class ThreadGroupingTest {

  public static void main(String[] args) {
    // create a thread group
    ThreadGroup group = new ThreadGroup("Avengers");

    // create thread
    Thread hero01 = new Thread(group, new Hero("Iron Man"));
    Thread hero02 = new Thread(group, new Hero("Thore"));
    Thread hero03 = new Thread(group, new Hero("Spider Man"));
    Thread hero04 = new Thread(group, new Hero("Hulk"));
    Thread hero05 = new Thread(group, new Hero("Captain America"));

    hero01.start();
    hero02.start();
    hero03.start();
    hero04.start();
    hero05.start();

    group.list();
  }
}
