import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDay {
    private static final String DATE_TIME_PATTERN = "EEEE, MMMM dd, yyyy HH:mm:ss";

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        /**
        * Define a format pattern for the desired output string
        * "EEEE" for full day name (e.g., "Wednesday")
        * "MMMM" for full month name (e.g., "July")
        * "dd" for day of the month (e.g., "02")
        * "yyyy" for year (e.g., "2025")
        * "HH" for hour in 24-hour format (e.g., "18")
        * "mm" for minute (e.g., "30")
        * "ss" for second (e.g., "00")
        */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);

        // Format and print the current date and time
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current Time and Day: " + formattedDateTime);
    }
}
