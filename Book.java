 /**
 * The Book class represents a book resource in the library.
 * Extends the Resource class to inherit basic properties.
 */
   public class Book extends Resource {
        private String author;              // The author of the book
        private int numPages;               // The number of pages in the book
    
    /**
     * Constructor to initialize a Book with specified attributes.
     * @param title The title of the book.
     * @param publisher The publisher of the book.
     * @param year The publication year of the book.
     * @param electronic Indicates whether the book is electronic (true) or physical (false).
     * @param numCopies The number of copies available for the book.
     * @param author The author of the book.
     * @param numPages The number of pages in the book.
     */

        public Book(String title, String publisher, int year, boolean electronic, int numCopies, String author, int numPages) {
        // Call the constructor of the superclass (Resource) to set common attributes
            super(title, publisher, year, electronic, numCopies);
            this.author = author;
            this.numPages = numPages;
        }
    /**
     * Override of the toString method to provide a custom string representation of the Book.
     * @return A string containing the author, title, publication year, and number of pages of the book.
     */
        @Override
        public String toString() {
            return author + ", " + getTitle() +  ", " + String.valueOf(getYear()) + ", " + numPages;
        }
    }

