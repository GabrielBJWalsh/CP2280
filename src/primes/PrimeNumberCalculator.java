package primes;
/**
 * prime calculator class
 * @author Gabe Walsh
 */
public class PrimeNumberCalculator {

    /**
     * a method to check if something is prime
     * uses the square root of the number to check if prime
     * if a number
     * @return
     */
    public static boolean isPrime(double number){
        double root = Math.sqrt(number);
        boolean isPrime=true;
        for(double i=2; i<=root; i=i+1.0){
            if(i%root==0){
                isPrime = false;
                break;

            }
            else{
                isPrime = true;
            }

        }


        return isPrime;
    }



}