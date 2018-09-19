import java.util.Scanner;


/**
 * Simple tester for Account Class
 */
public class AccountTester {

    public static void main(String[] args) {
        //Set up the scanner from the console
        Scanner consoleInput = new Scanner(System.in);
        String userInput;   //capture the users input

        //Start off with an empty account
        Account account = new Account(1000.0);

        //Build up an input system for users to manage an account
        do{
            System.out.printf("Account balance: %f\n", account.getBalance());
            System.out.println("Account management options: \n" +
                    "\tCredit the account [C]\n" +
                    "\tDebit the account [D]\n" +
                    "\tQuit [X]\n" +
                    "Enter selection:");
            userInput = consoleInput.next();
            //handle input

            if(userInput.equals("C")||userInput.equals("c")){
                System.out.println("Credit the account");
            } else if(userInput.equals("D")||userInput.equals("d")){
                account.debit(consoleInput.nextDouble());
            //System.out.println("Debit the account");
            }

            //System.out.printf("\nDEBUG s: %s\n", userInput);
        } while (!(userInput.equals("X")||userInput.equals("x"))); //Not X


    }

}