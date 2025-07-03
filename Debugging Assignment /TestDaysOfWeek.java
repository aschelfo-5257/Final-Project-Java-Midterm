Inport daysAndDates.DaysOfWeek;

public class TestDaysOfWeek {

  public static void main(String[] args) {
    System.out.println("Days of Week");

    for (int i = 0;i < 8;i++) {
      System.out.println("Number: " + i + "\tDay Of Week ")
    }
  }
}

package daysAndDates

public class DaysOfWeek {
  public static String DayOfWeekStr(Int NumberOfDay) {
    String dayStr = ""
    switch (NumberOfDay) {
      case 1:
        dayStr = "Sunday";
        break;
      case 2:
        dayStr = "Monday";
        break;
      case 3:
        dayStr = "Tuesday";
        break;
      case 4:
        dayStr = "Wednesday";
        break;
      case 5:
        dayStr = "Thursday";
        break;
      case 6:
        dayStr = "Friday";
        break;
      case 7:
        dayStr = "Saturday";
        break;
    }
  }
}
