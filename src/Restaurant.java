import java.util.ArrayList;

/**
 * Represents the restaurant and coordinates its different components.
 *<br><br>
 * The restaurant manages its tables, menu and cashier. It is responsible for handling bookings, orders
 * and payments by communicating with other objects.
 */
public class Restaurant
{
    private ArrayList<Table> tables;
    private Menu menu;
    private Cashier cashier;

    /**
     * Creates a new restaurant with an empty table list, a new menu and a new cashier.
     */
    public Restaurant()
    {
        tables = new ArrayList<>();
        menu = new Menu();
        cashier = new Cashier();
    }

    /**
     * Adds a table to the restaurant.
     *<br><br>
     * A table with the same table number must not already exist.
     *
     * @param table the table to add
     */
    public void addTable(Table table)
    {

    }

    /**
     * Returns the restaurant's menu.
     *
     * @return the Menu object
     */
    public Menu getMenu()
    {
        return null;
    }

    /**
     * Returns a copy of the list containing all restaurant tables.
     *
     * @return a copy of the table list
     */
    public ArrayList<Table> getTables()
    {
        return null;
    }

    /**
     * Searches for a table using its table number.
     *
     * @param tableNumber the number of the table to search for
     * @return the matching Table object, or null if no table is found
     */
    public Table findTable(int tableNumber)
    {
        return null;
    }

    /**
     * Attempts to book a specific table for a group of guests.
     *<br><br>
     * The restaurant should find the requested table and delegate the booking to the Table object.
     *
     * @param tableNumber the number of the table to book
     * @param guests the guests who want to book the table
     * @return true if the booking was successful, false otherwise
     */
    public boolean bookTable(int tableNumber, ArrayList<Guest> guests)
    {
        return false;
    }

    /**
     * Adds a meal from the restaurant's menu to a specific guest's order.
     *<br><br>
     * The restaurant must check that:
     * - The table exists.
     * - The table is currently occupied.
     * - The guest number is valid.
     * - The requested meal exists in the menu.
     *
     * @param tableNumber the number of the table
     * @param guestNumber the guest's position at the table, starting at 1
     * @param mealName the name of the meal to order
     * @return true if the meal was successfully added, false otherwise
     */
    public boolean addMealToOrder(int tableNumber, int guestNumber, String mealName)
    {
        return false;
    }

    /**
     * Returns the order belonging to a specific guest at a table.
     *
     * @param tableNumber the number of the table
     * @param guestNumber the guest's position at the table, starting at 1
     * @return the guest's Order object, or null if the table or guest is not found
     */
    public Order getOrderForGuest(int tableNumber, int guestNumber)
    {
        return null;
    }

    /**
     * Attempts to process payment for one guest at a specific table.
     *<br><br>
     * The restaurant should:
     * 1. Find the requested table.
     * 2. Retrieve the list of guests at the table.
     * 3. Check that none of the guests has already paid.
     * 4. Ask the cashier to process the payment using processTablePayment().
     * 5. Print one receipt using printTableReceipt() if payment succeeds.
     * 6. Mark all guests at the table as paid.
     * 7. Clear the table if all guests have paid.
     *<br><br>
     * If payment fails, the guest and their order should remain unchanged.
     *
     * @param tableNumber the number of the table
     * @param guestNumber the guest's position at the table, starting at 1
     * @param amountPaid the amount paid by the guest in SEK
     * @return true if the payment was successful, false otherwise
     */
    public boolean payForGuest(int tableNumber, int guestNumber, double amountPaid)
    {
        return false;
    }

    /**
     * Attempts to process one shared payment for all guests at a table. A shared table payment is only
     * allowed if none of the guests at the table has already paid.
     *<br><br>
     * The restaurant should:
     * 1. Find the requested table.
     * 2. Retrieve the list of guests at the table.
     * 3. Ask the cashier to process the payment using processTablePayment().
     * 4. Print one receipt using printTableReceipt() if payment succeeds.
     * 5. Mark all guests at the table as paid.
     * 6. Clear the table.
     *<br><br>
     * If payment fails, the table and its guests' orders should remain unchanged.
     *
     * @param tableNumber the number of the table
     * @param amountPaid the amount paid by the group in SEK
     * @return true if the payment was successful, false otherwise
     */
    public boolean payForTable(int tableNumber, double amountPaid)
    {
        return false;
    }

    /**
     * Displays all tables that are currently available.
     *<br><br>
     * If no tables are available, an appropriate message should be displayed.
     */
    public void showAvailableTables()
    {

    }
}