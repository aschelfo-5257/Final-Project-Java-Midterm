import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Utility class for retrieving month names in various formats.
 */
public class MonthUtil {

    /**
     * Returns an array of full English month names using the {@link java.time.Month} enum.
     *
     * @return an array containing month names from January to December
     */
    public static String[] getMonthNamesFromEnum() {
        Month[] months = Month.values();
        String[] monthNames = new String[months.length];

        for (int i = 0; i < months.length; i++) {
            monthNames[i] = months[i].getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        }

        return monthNames;
    }

    /**
     * Returns a hardcoded array of full English month names.
     *
     * @return an array containing month names from January to December
     */
    public static String[] getHardcodedMonthNames() {
        return new String[] {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
    }

    /**
     * Demonstrates the use of both dynamic and hardcoded month name retrieval methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Month Names (From Enum):");
        for (String month : getMonthNamesFromEnum()) {
            System.out.println(month);
        }

        System.out.println("\nMonth Names (Hardcoded):");
        for (String month : getHardcodedMonthNames()) {
            System.out.println(month);
        }
    }
}
