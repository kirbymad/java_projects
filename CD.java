/**
 * The CD class represents a compact disc (CD) resource in the library.
 * Extends the Resource class to inherit basic properties.
 */
public class CD extends Resource {
    private String artist;
    private int length;
/**
     * Constructor to initialize a CD with specified attributes.
     * @param title The title of the CD.
     * @param publisher The publisher of the CD.
     * @param year The publication year of the CD.
     * @param numCopies The number of copies available for the CD.
     * @param artist The artist of the CD.
     * @param length The length (duration) of the CD in minutes.
     */
    // Constructor
    public CD(String title, String publisher, int year, int numCopies, String artist, int length) {
    // Call the constructor of the superclass (Resource) to set common attributes
        super(title, publisher, year, false, numCopies);
        this.artist = artist;
        this.length = length;
    }

    /**
     * Override of the toString method to provide a custom string representation of the CD.
     * @return A string containing the artist, title, publication year, and length of the CD.
     */
    // Override toString method
    @Override
    public String toString() {
        return (artist + ", " + getTitle() + ", " + getYear() + ", " + length);
    }
}
