package leetcode;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        String prev;
        int count;
        char target;
        for (int i = 1; i < n; i++) {
            prev = curr.toString();
            curr = new StringBuilder();
            count = 1;
            target = prev.charAt(0);
            int prevLength = prev.length();
            for (int j = 1; j < prevLength; j++) {
                if (prev.charAt(j) == target) {
                    count++;
                } else {
                    curr.append(count).append(target);
                    count = 1;
                    target = prev.charAt(j);
                }
            }
            curr.append(count).append(target);
        }

        return curr.toString();
    }
}
