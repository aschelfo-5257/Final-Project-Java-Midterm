import java.time.Year;

/**
 * Represents an event with an associated year.
 * <p>
 * Demonstrates usage of the {@link java.time.Year} class for basic year operations.
 * </p>
 *
 */
public class Event {
    private int year;

    /**
     * Constructs an Event with the specified year.
     *
     * @param year the year of the event
     */
    public Event(int year) {
        this.year = year;
    }

    /**
     * Returns the year of this event.
     *
     * @return the year of the event
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Sets the year for this event.
     *
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        // Get the current year
        Year currentYear = Year.now();
        System.out.println("Current Year: " + currentYear);

        // Create a specific year
        Year y2025 = Year.of(2025);
        System.out.println("Year: " + y2025);

        // Check if a year is a leap year
        boolean isLeap = y2025.isLeap();
        System.out.println("Is 2025 a leap year? " + isLeap);

        // Parse a year from a String
        Year parsedYear = Year.parse("1999");
        System.out.println("Parsed Year: " + parsedYear);
    }
}
