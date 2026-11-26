public class Main
{
    private Main() {}

    public static void main(String[] args)
    {
        Restaurant restaurant = new Restaurant();
        restaurant.addTable(new Table(1, 2));
        restaurant.addTable(new Table(2, 4));
        restaurant.addTable(new Table(3, 4));
        restaurant.addTable(new Table(4, 6));
        restaurant.addTable(new Table(5, 8));

        Menu menu = restaurant.getMenu();
        menu.addMeal(new Meal("Garlic Bread", 45, "Starter"));
        menu.addMeal(new Meal("Bruschetta", 65, "Starter"));
        menu.addMeal(new Meal("Margherita Pizza", 125, "Main Course"));
        menu.addMeal(new Meal("Cheeseburger", 145, "Main Course"));
        menu.addMeal(new Meal("Pasta Carbonara", 155, "Main Course"));
        menu.addMeal(new Meal("Chocolate Cake", 75, "Dessert"));
        menu.addMeal(new Meal("Ice Cream", 55, "Dessert"));
        menu.addMeal(new Meal("French Fries", 35, "Side Dish"));
        menu.addMeal(new Meal("Side Salad", 40, "Side Dish"));

        UI ui = new UI(restaurant);
        ui.start();
    }
}