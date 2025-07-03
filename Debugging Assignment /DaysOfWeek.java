package daysAndDates; 

public class DaysOfWeek { 

    public static String dayOfWeekStr(int numberOfDay) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    if (numberOfDay < 1 || numberOfDay > 7) {
        return "Invalid day";
    }
    return days[numberOfDay - 1];
}
    
