package collections.set.checkin;

import java.time.LocalDate;
import java.util.Objects;

public class DailyCheckIn {

  public int employeeId;
  public LocalDate date;

  public DailyCheckIn(int employeeId, LocalDate date) {
    this.employeeId = employeeId;
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DailyCheckIn that = (DailyCheckIn) o;
    return employeeId == that.employeeId;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(employeeId);
  }
}
