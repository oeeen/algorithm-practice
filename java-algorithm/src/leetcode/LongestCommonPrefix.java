package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String common = strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].isEmpty()) return "";

                if (!strs[j].startsWith(common)) {
                    break;
                }

                if (j == strs.length - 1) {
                    return common;
                }
            }
            common = common.substring(0, common.length() - 1);
        }
        return common;
    }
}
