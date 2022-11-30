package ctci.ch1_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome pal;

    @BeforeEach
    public void before() {
        pal = new Palindrome();
    }

    @Test
    public void simpleTest() {
        String palindrome = "a man a plan a canal panama";
        assertTrue(pal.checkPalindrome(palindrome));
    }

    @Test
    public void nonPalindromeTest() {
        String nonpal = "a man a plan a canal venezuela";
        assertFalse(pal.checkPalindrome(nonpal));
    }
}