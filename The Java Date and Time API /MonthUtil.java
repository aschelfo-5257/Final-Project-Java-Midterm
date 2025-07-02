import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthUtil {

    // Returns an array of month names using Java's Month enum and formatting
    public static String[] getMonthsDynamic() {
        Month[] months = Month.values();
        String[] monthNames = new String[months.length];
        for (int i = 0; i < months.length; i++) {
            monthNames[i] = months[i].getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        }
        return monthNames;
    }

    // Returns a hardcoded array of month names
    public static String[] getMonthsHardcoded() {
        return new String[] {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
    }

    public static void main(String[] args) {
        // Usage for dynamic months
        System.out.println("Dynamic Month Names:");
        for (String month : getMonthsDynamic()) {
            System.out.println(month);
        }

        // Usage for hardcoded months
        System.out.println("\nHardcoded Month Names:");
        for (String month : getMonthsHardcoded()) {
            System.out.println(month);
        }
    }
}
