package primes;


public class PrimeTester {
    public static void main(String[] args) {
        System.out.println(PrimeNumberCalculator.isPrime(97));
        System.out.println(PrimeNumberCalculator.isPrime(24));

        // System.out.println(PrimeNumberCalculator.numberOfPrimes(100));
        for (int i = 0; i < 100; i++) {
            boolean prime = PrimeNumberCalculator.isPrime(i);
            int icounter = 0;
            if (prime) {
                icounter = icounter + 1;
                System.out.printf("\nis prime %d returns%b i number%d", i, PrimeNumberCalculator.isPrime(i),icounter);
            }
        }

        // System.out.println( PrimeNumberCalculator.uniquePrimeFactorized(5));

        //System.out.println(Math.PI*100);
    }
}
