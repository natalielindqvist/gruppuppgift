import java.util.ArrayList;

/**
 * Represents an order placed at a restaurant table. An order contains a list of
 * Meal objects.
 *<br><br>
 * Meals can be added to the order. The class is also responsible for calculating
 * and displaying the total price.
 */
public class Order
{
    private ArrayList<Meal> meals;

    /**
     * Creates an empty order.
     */
    public Order()
    {
        meals = new ArrayList<>();
    }

    /**
     * Adds a meal to the order. Multiple instances of the same meal are allowed.
     *
     * @param meal the meal to add
     * @return true if the meal was added successfully, false otherwise
     */
    public boolean addMeal(Meal meal)
    {
        return false;
    }

    /**
     * Calculates the total price of all meals currently in the order.
     *
     * @return the total price in SEK
     */
    public double calculateTotal()
    {
        return 0.0;
    }

    /**
     * Displays all meals in the order, including their individual prices and the total price.
     */
    public void showOrder()
    {

    }

    /**
     * Returns a copy of the list containing all meals in the order.
     *
     * @return a copy of the order's meal list
     */
    public ArrayList<Meal> getMeals()
    {
        return null;
    }

    /**
     * Removes all meals from the order. After this method is called, the order should
     * be empty.
     */
    public void clearOrder()
    {

    }
}