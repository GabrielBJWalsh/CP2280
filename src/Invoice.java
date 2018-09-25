/**
 * @author Gabe
 * an invoice for a hardware store
 */
public class Invoice {
    public String partNUM;
    public String pDiscription;
    public int quantity;
    public double price;
    public String set

    /**
     * get method for price
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * get method for the number of items bought
     * @return int
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * get method for the discription of the part
     * @return string
     */

    public String getpDiscription() {
        return pDiscription;
    }

    /**
     * get method for part number
     * @return string
     */

    public String getPartNUM() {
        return partNUM;
    }
    public void balance(){
        price = getPrice();
        quantity = getQuantity();
        total = price*quantity;
        if (total<0){
            return 0;
        }
        else{
            return total;
        }
    }
}
