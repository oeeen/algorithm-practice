package leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.isEmpty()) return 0;
        int index = s.length() - 1;
        boolean lastWordStart = false;
        int count = 0;
        while (!lastWordStart || s.charAt(index) != ' ') {
            if (!lastWordStart && s.charAt(index) == ' ') {
                index--;
            } else if (!lastWordStart && s.charAt(index) != ' ') {
                lastWordStart = true;
                count++;
                index--;
            } else if (lastWordStart && s.charAt(index) != ' ') {
                count++;
                index--;
            } else {
                break;
            }
            if (index < 0) break;
        }

        return count;
    }
}
