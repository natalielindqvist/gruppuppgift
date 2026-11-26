import java.util.List;

/**
 * Represents a single meal available at the restaurant. A meal has a name,
 * a price and a category.
 * <br><br>
 * The categories are Starter, Main Course, Dessert and Side Dish.
 */
public class Meal {
    private String name;
    private double price;
    private String category;


    /**
     * Creates a new meal.
     *
     * @param name     the name of the meal
     * @param price    the price of the meal in SEK
     * @param category the category the meal belongs to
     */
    public Meal(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    /**
     * Returns the name of the meal.
     *
     * @return the meal's name
     */
    public String getName() {

        return this.name;
    }

    /**
     * Returns the price of the meal.
     *
     * @return the meal's price in SEK
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Returns the category of the meal.
     *
     * @return the meal's category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Changes the price of the meal.
     *
     * @param price the new price in SEK
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a text representation of the meal,
     * including its name, category and price.
     *
     * @return a formatted description of the meal
     */
    public String toString() {
        return this.getName() + this.getCategory()+ this.getPrice();
    }

}