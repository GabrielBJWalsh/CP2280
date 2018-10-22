/**
 * invoice tester class
 */
public class InvoiceTester {

    public static void main(String[] args) {
        System.out.println("here is your invoice ");
        // make invoice object
        Invoice invoice = new Invoice();
        invoice.setPartNUM("0");
        invoice.setpDiscription("hammer");
        invoice.setPrice(1.0);
        invoice.setQuantity(99);

        System.out.printf("part number: %s\nDiscription: %s\nQuantity: %d\nprice: %.2f\n\n",
                invoice.getPartNUM(),
                invoice.getpDiscription(),
                invoice.getQuantity(),
                invoice.getPrice()
        );
        System.out.printf("total %.2f", invoice.balance());

    }
}