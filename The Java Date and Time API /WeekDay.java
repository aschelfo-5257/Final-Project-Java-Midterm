import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * The WeekDay class demonstrates how to get and display the current day of the week
 * in various formats using Java's Date and Time API.
 */
public class WeekDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Get the current date

        // Get the day of the week as an enum
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day of Week (enum): " + dayOfWeek);

        // Get the day of the week as a numerical value (1 for Monday, 7 for Sunday)
        int dayValue = dayOfWeek.getValue();
        System.out.println("Day of Week (value): " + dayValue);

        // Get the full name of the day of the week for the default locale
        String fullDayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Day of Week (full name): " + fullDayName);

        // Get the short name of the day of the week
        String shortDayName = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());
        System.out.println("Day of Week (short name): " + shortDayName);
    }
}
