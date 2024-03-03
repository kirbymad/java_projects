/**
 * The Library class represents a library with a collection of resources.
 */
public class Library {
    private Resource[] resources;    // Array to store the library's resources
    private int numResources;    // Total number of resources in the library

    /**
     * Constructor to initialize the library with a specified number of resources.
     * @param numResources The total number of resources the library can hold.
     */

    public Library(int numResources) {
        this.numResources = numResources;
        this.resources = new Resource[numResources];
    }
 /**
     * Adds a new resource to the library.
     * @param r The resource to be added.
     * @return True if the resource is successfully added, otherwise false.
     */
    public boolean addResource(Resource r) {
        for (int i = 0; i < numResources; i++) {
            if (resources[i] == null) {
                resources[i] = r;
                return true;
            }
        }
        return false;
    }
/**
     * Retrieves an array containing all the resources in the library.
     * @return An array containing all the resources.
     */
    public Resource[] getAllResources() {
        int count = 0;
        for (Resource r : resources) {
            if (r != null) {
                count++;
            }
        }
        Resource[] allResources = new Resource[count];
        int index = 0;
        for (Resource r : resources) {
            if (r != null) {
                allResources[index] = r;
                index++;
            }
        }
        return allResources;
    }
 /**
     * Retrieves an array containing all unavailable resources in the library.
     * @return An array containing all unavailable resources.
     */
    public Resource[] getUnavailable() {
        // Implement logic to return unavailable resources
            int count = 0;
            for (Resource r : resources) {
                if (r != null && !r.isAvailable()) {
                    count++;
                }
            }
            Resource[] unavailableResources = new Resource[count];
            int index = 0;
            for (Resource r : resources) {
                if (r != null && !r.isAvailable()) {
                    unavailableResources[index] = r;
                    index++;
                }
            }
            return unavailableResources;
        }
/**
     * Retrieves an array containing all resources checked out by a specific user.
     * @param user The user for whom checked-out resources are retrieved.
     * @return An array containing all resources checked out by the specified user.
     */
        public Resource[] getAllUserHasCheckedOut(String user) {
            int count = 0;
            for (Resource r : resources) {
                if (r != null && r.isBorrowedBy(user)) {
                    count++;
                }
            }
            Resource[] userCheckedOutResources = new Resource[count];
            int index = 0;
            for (Resource r : resources) {
                if (r != null && r.isBorrowedBy(user)) {
                    userCheckedOutResources[index] = r;
                    index++;
                }
            }
            return userCheckedOutResources;
        }
    
 /**
     * Retrieves an array containing all books in the library.
     * @return An array containing all books in the library.
     */
    public Resource[] getAllBooks() {
        int count = 0;
        for (Resource r : resources) {
            if (r instanceof Book) {
                count++;
            }
        }
        Resource[] allBooks = new Resource[count];
        int index = 0;
        for (Resource r : resources) {
            if (r instanceof Book) {
                allBooks[index] = r;
                index++;
            }
        }
        return allBooks;
    }
  /**
     * Retrieves an array containing all CDs in the library.
     * @return An array containing all CDs in the library.
     */   

    public Resource[] getAllCDs() {
        int count = 0;
        for (Resource r : resources) {
            if (r instanceof CD) {
                count++;
            }
        }
        Resource[] allCDs = new Resource[count];
        int index = 0;
        for (Resource r : resources) {
            if (r instanceof CD) {
                allCDs[index] = r;
                index++;
            }
        }
        return allCDs;
    }
}