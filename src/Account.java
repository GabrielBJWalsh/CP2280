import java.util.Scanner;

/**
 * Class for tracking a financial account
 *
 * @author Gabe.Walsh
 */
public class Account {

    private double balance;

    /**
     * Allows the creation of an account with a positive balance
     *
     * @param balance opening account balance (non-negative)
     */
    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    /**
     * Get the account balance
     *
     * @return
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * josh made me write this
     * @param amount
     */
    public void debit(double amount){
        if (amount > balance ){
            System.out.println("too big");
        }else if (amount<0) {
            System.out.println("dont be tricky");
        }else{
            balance= balance-amount;
        }




    }


}

