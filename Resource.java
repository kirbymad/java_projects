

public abstract class Resource {
    private String title;
    private String publisher;
    private int year;
    private boolean electronic;
    private int numCopies;
    private int availableCopies;
    private String[] borrowers;

    public Resource(String title, String publisher, int year, boolean isElectronic ,int numCopies) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.electronic = isElectronic;
        this.numCopies = numCopies;
        this.availableCopies = numCopies;
        this.borrowers = new String[numCopies];
    }
   /**
     * Returns the title of the resource.
     *
     * @return the title of the resource
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the publisher of the resource.
     *
     * @return the publisher of the resource
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Returns the array of borrowers who have borrowed the resource.
     *
     * @return the array of borrowers
     */
    public String[] getBorrowers() {
        return borrowers;
    }

    /**
     * Returns the year of publication of the resource.
     *
     * @return the year of publication
     */
    public int getYear() {
        return year;
    }
    /**
     * Returns true if the resource is electronic, and false otherwise.
     *
     * @return true if the resource is electronic, false otherwise
     */
    public boolean isElectronic() {
        return electronic;
    }
    // Other methods for checking availability, borrower status, and managing checkouts/check-ins
    public boolean isAvailable() {
        return availableCopies > 0;
    }
/**
     * Checks if a given person has borrowed any copies.
     * @param person The person to check for borrowing.
     * @return True if the person has borrowed a copy, otherwise false.
     */
    public boolean isBorrowedBy(String person) {
        for (String borrower : borrowers) {
            if (borrower != null && borrower.equals(person)) {
                return true;
            }
        }
        return false;
    }
/**
     * Abstract method to provide a string representation of the object.
     * Must be implemented by concrete subclasses.
     * @return A string representation of the object.
     */
    @Override
    public abstract String toString();
 /**
     * Checks out a copy to the specified borrower.
     * @param borrower The person to whom the copy is being checked out.
     * @return True if the checkout is successful, otherwise false.
     */
    public boolean checkOut(String borrower) {
        if (borrower != null && !borrower.equals("")) {
            for (int i = 0; i < numCopies; i++) {
                if (borrowers[i] == null) {
                    borrowers[i] = borrower;
                    availableCopies--;
                    return true;
                }
            }
        }
        return false;
    }
/**
     * Checks in a copy that was previously checked out by the specified borrower.
     * @param borrower The person who had checked out the copy.
     * @return True if the check-in is successful, otherwise false.
     */

    public boolean checkIn(String borrower) {
        for (int i = 0; i < numCopies; i++) {
            if (borrowers[i] != null && borrowers[i].equals(borrower)) {
                borrowers[i] = null;
                availableCopies++;
                return true;
            }
        }
        return false;
    }
}
