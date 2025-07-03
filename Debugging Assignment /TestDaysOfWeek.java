// Demonstrates mapping numbers 1-7 to days of the week
import daysAndDates.DaysOfWeek;

public class TestDaysOfWeek {

    public static void main(String[] args) {
        System.out.println("Days of Week:");

        for (int i = 1; i <= 7; i++) {
            // Assuming dayOfWeekStr(i) returns a valid day name for 1-7
            System.out.println("Number: " + i + "\tDay Of Week: " + DaysOfWeek.dayOfWeekStr(i));
        }
    }
}
