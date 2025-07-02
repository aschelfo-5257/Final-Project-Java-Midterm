import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

    public class MonthUtil {
    
        public static String[] getMonths() {
            Month[] months = Month.values();
            String[] monthNames = new String[months.length];
            for (int i = 0; i < months.length; i++) {
                monthNames[i] = months[i].getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            }
            return monthNames;
    
            // Method that returns an array of month names
            public static String[] getMonths() {
            return new String[] {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };
        }
        public static void main(String[] args) {
        String[] months = getMonths();
        for (String month : months) {
            System.out.println(month);
        }
    }
}
