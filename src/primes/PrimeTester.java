package primes;


import java.util.Scanner;

/**
 * tester class for Prime Calculator
 */

public class PrimeTester {
    public static void main(String[] args) {

        //Set up the scanner from the console
         Scanner consoleInput = new Scanner(System.in);
         String userInput;   //capture the users input
        do {
            System.out.println("Prime number operations: \n" +
                    "\tAll primes less then N [A]\n" +
                    "\tAll primes between N1 and N2 [B]\n" +
                    "\tunique prime factorization of a number [C]\n" +
                    "\tQuit [X]\n" +
                    "Enter selection:");
            userInput = consoleInput.next();
            if (userInput.equals("A")||userInput.equals("a")){
                System.out.println("Provide N:");
                PrimeNumberCalculator.printArray(PrimeNumberCalculator.primesBetween(0,consoleInput.nextInt()));

            }else if (userInput.equals("B")||userInput.equals("b")){
                System.out.println("Provide N:");
                int number = consoleInput.nextInt();
                System.out.println("Provide N2");
                int number2 = consoleInput.nextInt();

                PrimeNumberCalculator.printArray(PrimeNumberCalculator.primesBetween(number,number2));

            }
            else if (userInput.equals("C")||userInput.equals("c")){
                System.out.println("what number would you like the prime factor of?");
                System.out.println(PrimeNumberCalculator.uniquePrimeFactorized(consoleInput.nextInt()));
            }
            else {
                System.out.println("Invalid input try again ");
            }



        } while (!(userInput.equals("X") || userInput.equals("x"))); //Not X




    }

}