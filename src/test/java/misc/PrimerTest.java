package misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimerTest {
    private Primer primer;

    @BeforeEach
    void setUp() {
        primer = new Primer();
    }

    @Test
    public void generatePrimesTest() {
        final int NUMBER_OF_PRIMES = 100;
        Set primes = primer.generatePrimeNumbers(NUMBER_OF_PRIMES);
        Set expectedPrimes = getExpectedPrimes(NUMBER_OF_PRIMES);
        assertTrue(primes.containsAll(expectedPrimes) && primes.size() == expectedPrimes.size());
    }

    @Test
    public void isPrimeTest_returnsTrue() {
        assertTrue(primer.isPrime(40357));
    }

    @Test
    public void isPrimeTest_returnsFalse() {
        assertFalse(primer.isPrime(4));
        assertFalse(primer.isPrime(9));
        assertFalse(primer.isPrime(4098874));
    }

    private Set getExpectedPrimes(int count) {
        TreeSet<Integer> expectedPrimes = new TreeSet<>();
        BigInteger nextPrime = BigInteger.ONE;
        for(int i = 0; i< count; i++){
            nextPrime = nextPrime.nextProbablePrime();
            expectedPrimes.add(nextPrime.intValue());
        }
        System.out.println("expected primes: ");
        System.out.println(expectedPrimes);
        return expectedPrimes;
    }
}
