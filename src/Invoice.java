/**
 * @author Gabe
 * an invoice for a hardware store
 */
public class Invoice {
    public String partNUM;
    public String pDiscription;
    public int quantity;
    public double price;

    /**
     * set method to set part Number
     *
     *
     */
    public void setPartNUM(String partNUM) {
        this.partNUM = partNUM;


    }

    /**
     * set method for part discription
     *
     * @param pDiscription
     */

    public void setpDiscription(String pDiscription) {
        this.pDiscription = pDiscription;
    }

    /**
     * set method for number of items sold
     *
     * @param quantity
     */

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    /**
     * set method for price
     *
     * @param price
     */
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    /**
     * get method for price
     *
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * get method for the number of items bought
     *
     * @return int
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * get method for the discription of the part
     *
     * @return string
     */

    public String getpDiscription() {
        return pDiscription;
    }

    /**
     * get method for part number
     *
     * @return string
     */

    public String getPartNUM() {
        return partNUM;
    }

    public double balance() {
        price = getPrice();
        quantity = getQuantity();
        double total = price * quantity;
        if (total < 0) {
            total = 0;
        }
        return total;
        }

    }

