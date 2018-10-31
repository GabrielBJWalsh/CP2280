package primes;


import java.util.Scanner;

public class PrimeTester {
    public static void main(String[] args) {
        System.out.println(PrimeNumberCalculator.isPrime(59));
        System.out.println(PrimeNumberCalculator.isPrime(24));
        System.out.println(PrimeNumberCalculator.uniquePrimeFactorized(24));


        //Set up the scanner from the console
        Scanner consoleInput = new Scanner(System.in);
        String userInput;   //capture the users input

        // do while interface
        /*
        * a.Determines and displays all the prime numbers less than a value like 10,000 (take the value as input).
        * How many numbers up to 10,000 do you have to test to ensure that you’ve found all the primes?
        * (Hint: test up to 100 so the program executes quickly before upping it to 10,000.)
        *
         *  b.Prints all primes between two numbers.
        *
        * c.Prints the unique prime factorization of a number input by the user.
        *
         *  d.Has a nice console interface to manage these option*/
        do {

        } while (!(userInput.equals("X") || userInput.equals("x"))); //Not X


    }

}