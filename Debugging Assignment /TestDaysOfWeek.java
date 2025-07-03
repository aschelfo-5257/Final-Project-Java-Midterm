// Demonstrates mapping numbers 1-7 to days of the week
// import daysAndDates.DaysOfWeek;
// import DaysOfWeek; // Removed incorrect import

// If DaysOfWeek is in a package, use the correct import, e.g.:
// import daysAndDates.DaysOfWeek;

public class TestDaysOfWeek {

    public static void main(String[] args) {
        System.out.println("Days of Week:");

        for (int i = 1; i <= 7; i++) {
            // Assuming dayOfWeekStr(i) returns a valid day name for 1-7; for values outside this range, it should return an error message or "Invalid day"
            System.out.println(String.format("Number: %-2d  Day Of Week: %s", i, DaysOfWeek.dayOfWeekStr(i)));
        }
    }
}
