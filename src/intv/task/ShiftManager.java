package intv.task;

import java.util.ArrayList;
import java.util.List;

public class ShiftManager {

  public static void main(String[] args) {

    List<Shift> shiftList = new ArrayList<>();
    shiftList.add(new Shift("A", 9, 13));
    shiftList.add(new Shift("B", 12, 16));
    shiftList.add(new Shift("C", 14, 18));

    for (int outerIndex = 0; outerIndex < shiftList.size(); outerIndex++) {
      for (int innerIndex = outerIndex + 1; innerIndex < shiftList.size(); innerIndex++) {
        Shift s1 = shiftList.get(outerIndex);
        Shift s2 = shiftList.get(innerIndex);

        if (isOverLapping(s1, s2)) {
          System.out.println("Conflict : " + s1.getEmployee() + " with " + s2.getEmployee());
        }
      }
    }
  }

  private static boolean isOverLapping(Shift s1, Shift s2) {
    return s1.getStartHour() < s2.getEndHour() && s2.getStartHour() < s1.getEndHour();
  }

  static class Shift {
    private String employee;
    private int startHour;
    private int endHour;

    public Shift(String employee, int startHour,int endHour) {
      this.employee = employee;
      this.endHour = endHour;
      this.startHour = startHour;
    }

    public String getEmployee() {
      return employee;
    }

    public void setEmployee(String employee) {
      this.employee = employee;
    }

    public int getStartHour() {
      return startHour;
    }

    public void setStartHour(int startHour) {
      this.startHour = startHour;
    }

    public int getEndHour() {
      return endHour;
    }

    public void setEndHour(int endHour) {
      this.endHour = endHour;
    }

    @Override
    public String toString() {
      return "intv.task.ShiftManager.Shift{" +
        "employee='" + employee + '\'' +
        ", startHour=" + startHour +
        ", endHour=" + endHour +
        '}';
    }
  }
}
