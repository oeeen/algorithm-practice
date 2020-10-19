package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char curr = s.charAt(i);
            char next = s.charAt(i + 1);

            if (romanNumbers.get(curr) < romanNumbers.get(next)) {
                result -= romanNumbers.get(curr);
            } else {
                result += romanNumbers.get(curr);
            }
        }

        char lastChar = s.charAt(s.length() - 1);
        result += romanNumbers.get(lastChar);

        return result;
    }
}
