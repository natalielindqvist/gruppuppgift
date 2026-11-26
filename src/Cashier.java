import java.util.ArrayList;

/**
 * Handles payments and receipts at the restaurant.
 *<br><br>
 * The cashier is responsible for checking payments, calculating change and printing receipts.
 */
public class Cashier
{
    private ArrayList<String> paymentHistory;
    private double totalRevenue;
    private int numberOfPayments;

    /**
     * Creates a new cashier with an empty payment history and no recorded revenue or payments.
     */
    public Cashier()
    {
        paymentHistory = new ArrayList<>();
        totalRevenue = 0.0;
        numberOfPayments = 0;
    }

    /**
     * Processes a payment for one guest's order.
     *<br><br>
     * The payment should only be successful if:
     * - The guest is not null.
     * - The guest's order exists and contains at least one meal.
     * - The amount paid is not negative.
     * - The amount paid is equal to or greater than
     *   the total price of the order.
     *<br><br>
     * If the payment succeeds, the cashier should:
     * - Increase the total revenue by the order's total price.
     * - Increase the number of successful payments by one.
     * - Add information about the payment to the payment history.
     *<br><br>
     * The amount paid should not be added directly to the total revenue, since any change must be returned.
     * This method should not clear or modify the order.
     *
     * @param guest the guest whose order is being paid for
     * @param amountPaid the amount of money received in SEK
     * @return true if the payment is successful, false otherwise
     */
    public boolean processGuestPayment(Guest guest, double amountPaid)
    {
        return false;
    }

    /**
     * Processes one shared payment for all guests' orders at a table.
     *<br><br>
     * The payment should only be successful if:
     * - The guest list is not null or empty.
     * - The list does not contain null guests.
     * - The guests' combined orders contain at least one meal.
     * - The amount paid is not negative.
     * - The amount paid is equal to or greater than
     *   the combined total price of the orders.
     *<br><br>
     * If the payment succeeds, the cashier should:
     * - Increase the total revenue by the combined total price of the orders.
     * - Increase the number of successful payments by one.
     * - Add information about the payment to the payment history.
     *<br><br>
     * The amount paid should not be added directly to the total revenue, since any change must be returned.
     * This method should not clear or modify the guests' orders.
     *
     * @param guests the guests included in the payment
     * @param amountPaid the amount of money received in SEK
     * @return true if the payment is successful, false otherwise
     */
    public boolean processTablePayment(ArrayList<Guest> guests, double amountPaid)
    {
        return false;
    }

    /**
     * Calculates the change that should be returned to the customer.
     *<br><br>
     * If the amount paid is insufficient or the total is negative, the method should return 0.
     *
     * @param total the total price of the order in SEK
     * @param amountPaid the amount paid by the customer in SEK
     * @return the change to return in SEK
     */
    public double calculateChange(double total, double amountPaid)
    {
        return 0.0;
    }

    /**
     * Prints a receipt for one guest's completed payment.
     *<br><br>
     * The receipt should contain:
     * - The guest's name.
     * - All meals included in the guest's order.
     * - The total price.
     * - The amount paid.
     * - The change returned to the customer.
     *
     * @param guest the guest associated with the payment
     * @param amountPaid the amount paid by the guest
     * @return the formatted receipt
     */
    public String printGuestReceipt(Guest guest, double amountPaid)
    {
        return "";
    }

    /**
     * Prints one receipt for a shared payment made by all guests at a table.
     *<br><br>
     * The receipt should contain:
     * - The names of all guests included in the payment.
     * - All meals included in the guests' orders.
     * - The combined total price.
     * - The amount paid.
     * - The change returned to the group.
     *
     * @param guests the guests associated with the payment
     * @param amountPaid the amount paid by the group
     * @return the formatted receipt
     */
    public String printTableReceipt(ArrayList<Guest> guests, double amountPaid)
    {
        return "";
    }

    /**
     * Returns the total revenue from all successful payments.
     *
     * @return the restaurant's total revenue in SEK
     */
    public double getTotalRevenue()
    {
        return 0.0;
    }

    /**
     * Returns the number of successful payments.
     *
     * @return the number of successful payments
     */
    public int getNumberOfPayments()
    {
        return 0;
    }

    /**
     * Displays the history of successful payments.
     */
    public void showPaymentHistory()
    {

    }
}