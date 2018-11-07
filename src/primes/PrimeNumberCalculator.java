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
    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

    /**
     * a method to get the number of primes between 0 and a number
     *
     * @param number
     * @return
     */
    public static int numberOfPrimes(int number) {
        int counter = 0;
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)) {
                // System.out.printf("number%d is prime\n counter is%d ", i, counter);
                counter = counter + 1;
                //System.out.printf("\nis prime %.2f returns ture", i);
            }
        }
        return counter;
    }

    /**
     * a method to list primes between n and n2
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int[] primesBetween(int num1, int num2) {
        int counter = 0;
        int holder;
        if (num1>num2){
            holder = num2;
            num2=num1;
            num2= holder;
        }
        int[] primesBetween = new int[numberOfPrimes(num2)];
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                primesBetween[counter] = i;
                counter++;

            }

        }
        return primesBetween;

    }

    /**
     * method used for printing arrays
     *
     * @param intAray
     */
    static void printArray(int[] intAray) {
        for (int i = 0; i < intAray.length; i++) {
            if (intAray[i] != 0) {
                System.out.println(intAray[i]);
            }
        }
    }

    /**
     * a method that returns the prime factors of a number
     *
     * @param number

     * @return
     */
    public static String uniquePrimeFactorized(int number) {
        String factors = "";
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors += i + " x ";
                number = number / i;
            }

        }
        if (number > 2) {
            factors += "";
        }

        return factors;
    }
}

        /*python testing
        * def uniquePrimes(number):
    factors = "";
    for i  in range(2,number):
        while number % i == 0:
            factors += str(i) + " ";
            number = number / i;


        if number > 2:
            factors += " ";

    return factors;


print(uniquePrimes(49))*/