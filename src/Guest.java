/**
 * Represents a guest visiting the restaurant. Each guest has a name and an
 * individual order. A guest can also keep track of whether their order
 * has been paid for.
 */
public class Guest
{
    private String name;
    private Order order;
    private boolean paid;

    /**
     * Creates a new guest with the specified name.
     *
     * @param name the name of the guest
     */
    public Guest(String name)
    {
        this.name = name;
        order = new Order();
        paid = false; //defaultvärde: ändras när betalning sker
    }

    /**
     * Returns the guest's name.
     *
     * @return the guest's name
     */
    public String getName()
    {
        return "";
    }

    /**
     * Changes the guest's name.
     *
     * @param name the new name of the guest
     */
    public void setName(String name)
    {

    }

    /**
     * Returns the guest's individual order.
     *
     * @return the guest's Order object
     */
    public Order getOrder()
    {
        return null;
    }

    /**
     * Checks whether the guest has paid for their order.
     *
     * @return true if the guest has paid, false otherwise
     */
    public boolean hasPaid()
    {
        return false;
    }

    /**
     * Marks the guest's order as paid.
     */
    public void markAsPaid()
    {

    }

    /**
     * Returns a text representation of the guest.
     *
     * @return the guest's name
     */
    public String toString()
    {
        return "";
    }
}
