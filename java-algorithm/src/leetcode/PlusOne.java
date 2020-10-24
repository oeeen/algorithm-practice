package leetcode;

/**
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (digits[index] == 9) {
            digits[index--] = 0;
            if (index < 0) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }
        }
        digits[index]++;

        return digits;
    }
}
