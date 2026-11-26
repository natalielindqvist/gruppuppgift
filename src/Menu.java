import java.util.ArrayList;
import java.util.List;

/**
 * Represents the restaurant's menu. The menu contains a collection of Meal objects.
 * <br><br>
 * Meals can be added and searched for. The menu can also display all meals
 * or only meals belonging to a specific category.
 */
public class Menu {
    private ArrayList<Meal> meals;

    /**
     * Creates an empty menu.
     */
    public Menu() {
        meals = new ArrayList<>();
    }

    /**
     * Adds a meal to the menu. A meal with the same name must not already exist.
     * The comparison should not be case-sensitive.
     *
     * @param meal the meal to add
     */
    public void addMeal(Meal meal) {
        containsMeal(meal.getName().toLowerCase());
        meals.add(meal);
    }

    /**
     * Searches for a meal in the menu using its name. The search should not be case-sensitive.
     *
     * @param mealName the name of the meal to search for
     * @return the matching Meal object, or null if no matching meal is found
     */
    public Meal findMeal(String mealName) {

        boolean alreadyExist = false;
        for (Meal line : meals) {


            if (line.getName().contains(mealName)) {
                System.out.println("Här är måltiden ");
                alreadyExist = true;
                return line;

            } else {
                System.out.println("Denna måltid finns inte ");
            }

        }
        return null;
    }

    /**
     * Checks whether a meal with the given name exists in the menu.
     *
     * @param mealName the name of the meal to search for
     * @return true if the meal exists, false otherwise
     */
    public boolean containsMeal(String mealName) {
        boolean alreadyExist = false;
        for (Meal line : meals) {


            if (line.getName().contains(mealName)) {
                System.out.println(" Finns redan ");
                alreadyExist = true;
                break;

            } else {
                System.out.println(" Har lagts till ");
            }

        }

        return alreadyExist;
    }

    /**
     * Displays the meals belonging to the specified category. If the category is "All",
     * every meal should be displayed. If no matching meals are found, an appropriate
     * message should be displayed.
     *
     * @param category the category to display, or "All" to display the entire menu
     */
    public void showMenu(String category) {
        for (Meal line : meals) {
            if (category == "All") {

                System.out.println(line.getName());
                if (line.getCategory().equals(category)) {
                    System.out.println(line.getName());
                }

            }

        }
    }

    /**
     * Returns a copy of the list containing all meals in the menu.
     *
     * @return a copy of the menu's meal list
     */
    public ArrayList<Meal> getMeals() {
        ArrayList<Meal> returnList = new ArrayList<>();
        for (Meal line : meals) {
            System.out.println(line.getName());
        }
        return returnList;
    }
}