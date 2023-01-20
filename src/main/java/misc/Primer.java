package misc;

import java.util.Set;
import java.util.TreeSet;

public class Primer {

    TreeSet<Integer> primes;

    public Set generatePrimeNumbers(int count) {
        primes = new TreeSet<>();
        for(int i=0; i < count; i++){
            primes.add(getNextPrime());
        }
        System.out.println("generated primes: ");
        System.out.println( primes);
        return primes;
    }

    private int getNextPrime() {
        int largestPrimeFoundSoFar = primes.size() == 0 ? 1 : primes.last();
        return nextPrime(largestPrimeFoundSoFar);
    }

    private Integer nextPrime(int number) {
        number ++;
        while(!isPrime(number)){
            number++;
        };
        return number;
    }

    boolean isPrime(int number) {
        if(number < 2){
            return false;
        }
        Double num = Double.valueOf(number);
        Double squareRoot = Math.sqrt(num);
        for(int i=2; i<=squareRoot ; i ++){
            //TODO only need to divide by odd numbers as evens cannot be prime.
            if(
//                    !isEven(i) && i != 2 &&
                    number % i == 0){
                return false;
            }
        }
        return true;
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }
}
