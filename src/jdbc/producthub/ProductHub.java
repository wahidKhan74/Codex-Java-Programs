package jdbc.producthub;

import jdbc.conn.DbConn;

import java.sql.Connection;
import java.util.Scanner;

import static jdbc.producthub.AddProduct.addProduct;
import static jdbc.producthub.DeleteProduct.deleteProduct;
import static jdbc.producthub.UpdateProduct.updateProduct;
import static jdbc.producthub.ViewProduct.viewProducts;

public class ProductHub {

  static Connection conn;
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      conn = new DbConn().get();

      while (true) {
        System.out.println("\n--- Product Management Menu ---");
        System.out.println("1. Add Product");
        System.out.println("2. View All Products");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Exit");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
2

        switch (choice) {
          case 1 -> addProduct(scanner, conn);
          case 2 -> viewProducts(conn);
          case 3 -> updateProduct(scanner, conn);
          case 4 -> deleteProduct(scanner, conn);
          case 5 -> {
            System.out.println("Exiting...");
            return;
          }
          default -> System.out.println("Invalid choice. Try again.");
        }
      }
    } catch (Exception e) {
      System.out.println("Operation Error : "+ e.getMessage());
    }
  }
}
