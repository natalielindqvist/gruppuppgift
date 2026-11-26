import java.util.Scanner;

/**
 * Handles all interaction between the user and the restaurant system.
 *<br><br>
 * The UI displays menus, receives user input and communicates with the Restaurant object.
 *<br><br>
 * It is responsible for presenting information and forwarding user requests to the
 * appropriate methods in other classes.
 */
public class UI
{
    private Restaurant restaurant;
    private Scanner scanner;

    /**
     * Creates a new user interface connected to the specified restaurant.
     *
     * @param restaurant the restaurant the UI communicates with
     */
    public UI(Restaurant restaurant)
    {
        this.restaurant = restaurant;
        scanner = new Scanner(System.in);
    }

    /**
     * Starts the restaurant application.
     *<br><br>
     * Displays the main menu repeatedly and allows the user to select different actions.
     *<br><br>
     * The application should continue running until the user chooses to exit.
     */
    public void start()
    {

    }

    /**
     * Displays the main menu with all available
     * user actions.
     */
    public void showMainMenu()
    {

    }

    /**
     * Displays a submenu containing the available meal categories.
     *<br><br>
     * The user can select one of the following:
     * - All meals
     * - Starter
     * - Main Course
     * - Dessert
     * - Side Dish
     *<br><br>
     * The selected category should be sent to the Menu object, which is responsible for
     * displaying the matching meals.
     *<br><br>
     * The user should also be able to return to the main menu.
     */
    public void showMenu()
    {

    }

    /**
     * Displays all tables that are currently available for booking.
     *<br><br>
     * The information should be retrieved through the Restaurant object.
     */
    public void showAvailableTables()
    {

    }

    /**
     * Handles the process of booking a table.
     *<br><br>
     * The method should:
     * 1. Ask how many guests want to book.
     * 2. Create a Guest object for each guest.
     * 3. Ask which table they want to book.
     * 4. Send the booking request to the Restaurant.
     *<br><br>
     * The method should handle invalid user input.
     */
    public void bookTable()
    {

    }

    /**
     * Handles the process of placing an order.
     *<br><br>
     * The method should:
     * 1. Ask which table wants to place an order.
     * 2. Check that the table exists and is occupied.
     * 3. Display the guests at the table and let the user
     *    select which guest is ordering.
     * 4. Let the user select a meal category.
     * 5. Display the meals in the selected category.
     * 6. Allow the selected guest to order multiple meals.
     * 7. Check that each selected meal belongs to the
     *    chosen category.
     * 8. Send each valid meal selection to Restaurant.
     *<br><br>
     * The user should be able to finish ordering by submitting an empty meal name.
     *<br><br>
     * Finally, the selected guest's updated order should be displayed.
     */
    public void placeOrder()
    {

    }

    /**
     * Displays the order belonging to a specific guest.
     *<br><br>
     * The method should ask for a table number and guest number, retrieve the order
     * through Restaurant and display it.
     *<br><br>
     * An appropriate message should be displayed if the table or guest does not exist.
     */
    public void showOrder()
    {

    }

    /**
     * Processes a single payment for all guests at a table. The cashier calculates the
     * total cost of all guests' orders and checks whether the amount paid is sufficient.
     * If the payment is successful, all guests are marked as paid.
     *
     * @param tableNumber the number of the table to pay for
     * @param amountPaid the amount of money paid
     * @return true if the payment was successful, false otherwise
     */
    public boolean payForTable(int tableNumber, double amountPaid)
    {
        return false;
    }

    /**
     * Reads an integer from the user.
     *<br><br>
     * If the input is not a valid integer, the user should be asked to try again.
     *
     * @param message the message displayed before reading the input
     * @return the integer entered by the user
     */
    private int readInt(String message)
    {
        return 0;
    }

    /**
     * Reads a decimal number from the user.
     *<br><br>
     * If the input is not a valid number, the user should be asked to try again.
     *
     * @param message the message displayed before reading the input
     * @return the decimal number entered by the user
     */
    private double readDouble(String message)
    {
        return 0.0;
    }
}
