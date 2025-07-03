import java.time.Year;

/**
 * Represents an event with an associated year.
 * <p>
 * Demonstrates usage of the {@link java.time.Year} class for basic year operations.
 * </p>
 *
 */
public class Event {
    private Year year;

    /**
     * Constructs an Event with the specified year.
     *
     * @param year the year of the event
     */
    public Event(Year year) {
        this.year = year;
    }

    /**
     * Returns the year of this event.
     *
     * @return the year of the event
     */
    public Year getYear() {
        return this.year;
    }

    /**
     * Sets the year for this event.
     *
     * @param year the year to set
     */
    public void setYear(Year year) {
        this.year = year;
    }
    /**
     * Returns a string representation of the event.
     *
     * @return a string containing the year of the event
     */
}
