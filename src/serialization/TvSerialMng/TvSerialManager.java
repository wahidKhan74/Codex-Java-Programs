package serialization.TvSerialMng;

import java.io.*;
import java.util.*;

public class TvSerialManager {

  private static final String FILE_NAME = "tvserials.ser";
  private static List<TvSerial> tvSerials = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    loadData();
    while (true) {
      System.out.println("\n--- TV Serial Management ---");
      System.out.println("1. Add TV Serial");
      System.out.println("2. View All TV Serials");
      System.out.println("3. Update TV Serial");
      System.out.println("4. Delete TV Serial");
      System.out.println("5. Exit");
      System.out.print("Choose an option: ");

      switch (scanner.nextInt()) {
        case 1 -> addTvSerial();
        case 2 -> viewAll();
        case 3 -> updateTvSerial();
        case 4 -> deleteTvSerial();
        case 5 -> {
          saveData();
          System.out.println("Exiting...");
          return;
        }
        default -> System.out.println("Invalid choice. Try again.");
      }
    }
  }

  private static void addTvSerial() {
    System.out.print("Enter ID: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // clear buffer
    System.out.print("Enter Title: ");
    String title = scanner.nextLine();
    System.out.print("Enter Genre: ");
    String genre = scanner.nextLine();
    System.out.print("Enter Number of Episodes: ");
    int episodes = scanner.nextInt();

    TvSerial serial = new TvSerial(id, title, genre, episodes);
    tvSerials.add(serial);
    saveData();
    System.out.println("TV Serial added successfully.");
  }

  private static void viewAll() {
    if (tvSerials.isEmpty()) {
      System.out.println("No TV serials found.");
    } else {
      tvSerials.forEach(System.out::println);
    }
  }

  private static void updateTvSerial() {
    System.out.print("Enter ID to update: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // clear buffer
    for (TvSerial s : tvSerials) {
      if (s.getId() == id) {
        System.out.print("Enter new Title: ");
        s.setTitle(scanner.nextLine());
        System.out.print("Enter new Genre: ");
        s.setGenre(scanner.nextLine());
        System.out.print("Enter new Episode Count: ");
        s.setEpisodes(scanner.nextInt());
        saveData();
        System.out.println("TV Serial updated.");
        return;
      }
    }
    System.out.println("TV Serial not found.");
  }

  private static void deleteTvSerial() {
    System.out.print("Enter ID to delete: ");
    int id = scanner.nextInt();
    boolean removed = tvSerials.removeIf(s -> s.getId() == id);
    if (removed) {
      saveData();
      System.out.println("TV Serial deleted.");
    } else {
      System.out.println("TV Serial not found.");
    }
  }

  private static void saveData() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
      oos.writeObject(tvSerials);
    } catch (IOException e) {
      System.out.println("Error saving data: " + e.getMessage());
    }
  }

  private static void loadData() {
    File file = new File(FILE_NAME);
    if (!file.exists()) return;

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
      tvSerials = (List<TvSerial>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error loading data: " + e.getMessage());
    }
  }
}
