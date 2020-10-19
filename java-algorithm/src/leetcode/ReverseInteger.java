package leetcode;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example: Input x = 123, Output = 321
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int prevResult = result;
            int digit = x % 10;
            result = result * 10 + digit;
            x /= 10;
            if (prevResult * 10.0 + digit > Integer.MAX_VALUE || prevResult * 10.0 + digit < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return result;
    }
}
