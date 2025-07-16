package collections.set.checkin;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class DailyCheckInSystem {

  /** Holds *all* check‑ins, no matter which day. */
  private final Set<DailyCheckIn> checkIns = new HashSet<>();

  /** Attempt to check in an employee for today. */
  public boolean checkIn(Employee employee) {
    DailyCheckIn record = new DailyCheckIn(employee.id, LocalDate.now());
    boolean isCheckedIn = checkIns.add(record);
    System.out.printf("%s %s%n",
      isCheckedIn ? "Checked‑in:" : "Already done today:", employee);
    return isCheckedIn;
  }

  /** Show everyone logged history who has checked in today. */
  public void showToday() {
    LocalDate today = LocalDate.now();
    System.out.println("\nToday's check‑ins:");
    checkIns.stream()
      .filter(r -> r.date.equals(today))
      .map(r -> r.employeeId)               // only IDs available here
      .forEach(System.out::println);
  }

  public static void main(String[] args) {

    Employee e1 = new Employee(101, "Wahid", 4545.65);
    Employee e2 = new Employee(102, "Aisha", 5671.676);
    Employee e3 = new Employee(103, "Naina", 5678.90);

    DailyCheckInSystem system = new DailyCheckInSystem();

    system.checkIn(e3);
    system.checkIn(e1);
    system.checkIn(e2);
    system.checkIn(e3); // duplicate
    system.checkIn(e1);

    system.showToday();
  }
}
