

/**
 * tester class for the invoice class
 *
 * @author Gabe Walsh
 */
public class InvoiceTester {
    public static void main(String[] args) {
        // make invoice
        Invoice invoice = new Invoice("0", "hammer", 1, 1);
        System.out.printf("Part Number: %s\npartNum Description: %s\npDiscription Quantity: %d\nquantity Price: %.2f\n\n",
                invoice.getPartNUM(),
                invoice.getpDiscription(),
                invoice.getQuantity(),
                invoice.getPrice());
        System.out.printf("Total invoice amount: $%.2f", invoice.balance());


        //System.out.println("i ran ");
    }
}