import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDay {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a format pattern for the desired output string
        // "EEEE" for full day name (e.g., "Wednesday")
        // "MMMM" for full month name (e.g., "July")
        // "dd" for day of the month (e.g., "02")
        // "yyyy" for year (e.g., "2025")
        // "HH" for hour in 24-hour format (e.g., "18")
        // "mm" for minute (e.g., "30")
        // "ss" for second (e.g., "00")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");

        // Format the current date and time into a string
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the formatted string
        System.out.println("Current Time and Day: " + formattedDateTime);
    }
}
