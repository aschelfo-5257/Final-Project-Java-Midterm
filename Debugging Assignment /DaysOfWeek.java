package daysAndDates; 

public class DaysOfWeek { 

    public static String dayOfWeekStr(int numberOfDay) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    if (numberOfDay < 1 || numberOfDay > 7) {
        return "Invalid day";
    }
    return days[numberOfDay - 1];
    /**
     * Returns the name of the day for a given number (1=Sunday, ..., 7=Saturday).
     * @param numberOfDay the day number (1-7)
     * @return the name of the day, or "Invalid day" if out of range
     */
}
