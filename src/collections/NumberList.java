package collections;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
  public static void main(String[] args) {

    // Translation amounts
    List<Double> txAmount = new ArrayList<Double>();

    txAmount.add(304.44);
    txAmount.add(456.34);
    txAmount.add(199.89);
    txAmount.add(545.890);
    txAmount.add(2324.56);
    txAmount.add(545.89);

    System.out.println(txAmount);

    System.out.println(txAmount.get(2));
  }
}
