import java.util.ArrayList;

/**
 * Represents a table in the restaurant.
 *<br><br>
 * A table has a table number, a seating capacity and an availability status.
 *<br><br>
 * Each table can have multiple guests. Every guest has their own Order object.
 *<br><br>
 * A table becomes unavailable when it is booked and available again when it is cleared.
 */
public class Table
{
    private int tableNumber;
    private int capacity;
    private boolean available;

    private ArrayList<Guest> guests;

    /**
     * Creates a new table with the specified number and seating capacity.
     *<br><br>
     * The table should initially be available and have no guests.
     *
     * @param tableNumber the table's unique number
     * @param capacity the maximum number of guests the table can accommodate
     */
    public Table(int tableNumber, int capacity)
    {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        available = true;
        guests = new ArrayList<>();
    }

    /**
     * Checks whether the table is available for booking.
     *
     * @return true if the table is available, false otherwise
     */
    public boolean isAvailable()
    {
        return false;
    }

    /**
     * Attempts to book the table for a group of guests.
     *<br><br>
     * The booking should only succeed if:
     * - The table is currently available.
     * - The guest list is not null or empty.
     * - The number of guests does not exceed capacity.
     * - The guest list does not contain null elements.
     *<br><br>
     * If the booking succeeds, all guests should be added to the table
     * and the table should become unavailable.
     *<br><br>
     * If the booking fails, the table should remain unchanged.
     *
     * @param guests the list of guests who want to book the table
     * @return true if the booking was successful, false otherwise
     */
    public boolean bookTable(ArrayList<Guest> guests)
    {
        return false;
    }

    /**
     * Adds one guest to the table if there is enough room.
     *<br><br>
     * The guest should only be added if:
     * - The guest is not null.
     * - The table has available capacity.
     *<br><br>
     * If the guest is successfully added, the table should become unavailable.
     * If the guest cannot be added, the table should remain unchanged.
     *
     * @param guest the guest to add
     * @return true if the guest was successfully added, false otherwise
     */
    public boolean addGuest(Guest guest)
    {
        return false;
    }

    /**
     * Checks whether all guests at the table have paid.
     *
     * @return true if every guest has paid, false otherwise
     */
    public boolean areAllGuestsPaid()
    {
        return false;
    }

    /**
     * Clears the table after the guests have finished their visit and payment has been completed.
     *<br><br>
     * All guests should be removed and the table should become available.
     */
    public void clearTable()
    {

    }

    /**
     * Returns the table's unique number.
     *
     * @return the table number
     */
    public int getTableNumber()
    {
        return 0;
    }

    /**
     * Returns the maximum number of guests the table can accommodate.
     *
     * @return the table's seating capacity
     */
    public int getCapacity()
    {
        return 0;
    }

    /**
     * Returns a copy of the list containing the guests currently associated with the table.
     *
     * @return a copy of the guest list
     */
    public ArrayList<Guest> getGuests()
    {
        return null;
    }

    /**
     * Returns a text representation of the table, including its number, capacity, availability
     * and current number of guests.
     *
     * @return a formatted description of the table
     */
    public String toString()
    {
        return "";
    }
}
