package primes;

/**
 * prime calculator class
 *
 * @author Gabe Walsh
 */
public class PrimeNumberCalculator {

    /**
     * a method to check if something is prime
     * uses the square root of the number to check if prime
     * if a number
     *
     * @return
     */
    private static boolean isPrime(int num)
    {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }/*
    public static boolean isPrime(double number) {
        double root = Math.sqrt(number);
        boolean isPrime = true;
        for (double i = 2; i <= root; i = i + 1.0) {
            if (i % root == 0) {
                isPrime = false;
                break;

            } else {
                isPrime = true;
            }

        }


        return isPrime;
    }
*/
    /**
     * a method to get the number of primes between 0 and a number
     * @param number
     * @return
     */

    public static int numberOfPrimes(int number) {
        int counter = 0;
        for (double i = 0; i <= number; i++) {
            if (isPrime(i)) {
                /*System.out.printf("number%d is prime\n counter is%d ",i,counter);
                counter = counter + 1;*/
                System.out.printf("\nis prime %.2f returns ture",i);
            }
        }
        return counter;
    }

    public static int[] primesList(int number) {


        int[] primeList = new int[numberOfPrimes(number)];
        return primeList;
    }






public static String uniquePrimeFactorized(int number){

        return"hi";
        }
        }