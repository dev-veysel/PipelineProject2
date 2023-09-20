import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testIsPalindromeWithPalindrome() {
        String input = "A man a plan a canal Panama";
        assertTrue(Palindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        String input = "Hello, world!";
        assertFalse(Palindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        String input = "";
        assertTrue(Palindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        String input = "x";
        assertTrue(Palindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeWithSpecialCharacters() {
        String input = "Was it a car or a cat I saw?";
        assertFalse(Palindrome.isPalindrome(input));
    }
}