package leetcode;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) break;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    if (j + 1 == needle.length()) return i;
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}
