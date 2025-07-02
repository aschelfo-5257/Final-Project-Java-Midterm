import java.time.Year;

public class year {
    private int year;

    // Constructor
    public Event(int year) {
        this.year = year;
    }

    // Getter method for year
    public int getYear() {
        return this.year;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }
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
