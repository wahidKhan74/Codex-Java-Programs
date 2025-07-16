package collections.list;

import java.util.ArrayList;
import java.util.List;

class Product {
  public String id;
  public String name;
  public double price;
  public int quantity;

  public Product(String id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "\n{ " +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", price=" + price +
      ", quantity=" + quantity +
      '}';
  }
}

public class Cart {

  List<Product> cartList = new ArrayList<Product>();

  public void addItem(Product product) {
    // 1.  Check if product already exists
    for (Product prd : cartList) {
      if (prd.id.equals(product.id)) {   // same id → increment
        prd.quantity += 1;
        return;                        // done
      }
    }
    // 2.  Not found → add as new item
    product.quantity = 1;
    cartList.add(product);
  }

  public void removeItem(Product product) {
    for (int i = 0; i < cartList.size(); i++) {
      Product prd = cartList.get(i);
      if (prd.id.equals(product.id)) {
        if (prd.quantity > 1) {
          prd.quantity -= 1;
        } else {
          cartList.remove(i);  // safe to remove by index
        }
        return;
      }
    }
    System.out.println("Product not found in cart.");
  }

  public void printCart() {
    System.out.println("Cart:");
    for (Product p : cartList) {
      System.out.println(p);
    }
    System.out.println("-------------");
  }

  public static void main(String[] args) {

    Cart cart = new Cart();

    cart.addItem(new Product("PR102", "LG Fan", 3455.55));
    cart.addItem(new Product("PR101", "LG Mixer", 390.55));
    cart.addItem(new Product("PR102", "LG Fan", 3455.55));
    cart.addItem(new Product("PR103", "LG TV", 8555.55));

    cart.printCart();
    System.out.println("-------------------");
    cart.removeItem(new Product("PR102", "LG Fan", 3455.55));
    cart.removeItem(new Product("PR102", "LG Fan", 3455.55));
    cart.printCart();
  }
}
