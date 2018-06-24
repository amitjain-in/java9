package amit.problems;

public class PrimeNumberFinder {

    public PrimeNumberFinder() {

    }

    //Much worse than Sieve of Erasthenos
    public int[] getFirstNPrimes(int n) {
        int primes[] = new int[n];
        primes[0] = 1;
        primes[1] = 2;
        primes[2] = 3;
        int currentIndex = 3;
        int currentNumber = 4;
        long startTs = System.currentTimeMillis();
        while(currentIndex < n) {
            int i = primes[currentIndex - 1] + 1;
            boolean primeFound = true;
            for(int j = 2; j < currentNumber; j++) {
                if(currentNumber % j == 0) {
                    primeFound = false;
                    break;
                }
            }
            if(primeFound) {
                primes[currentIndex] = currentNumber;
                currentIndex++;
                System.out.println("Index = " + currentIndex + " Number = " + currentNumber);
            }
            currentNumber++;
        }
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTs) + " milliseconds");
        return primes;
    }

    public static void main(String args[]) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        primeNumberFinder.getFirstNPrimes(26);
    }
}
