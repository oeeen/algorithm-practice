package leetcode;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int numberOfDigits = 0;
        int originX = x;
        while (x != 0) {
            numberOfDigits++;
            x /= 10;
        }

        int[] digits = new int[numberOfDigits];
        x = originX;
        for (int i = 0; i < numberOfDigits; i++) {
            digits[i] = x % 10;
            x /= 10;
        }

        for (int i = 0; i < numberOfDigits / 2; i++) {
            if ((digits[i] ^ digits[numberOfDigits - i - 1]) != 0) {
                return false;
            }
        }
        return true;
    }
}
