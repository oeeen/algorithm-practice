package etc;

import java.util.Stack;

public class BetterEbay5 {
    public String solution(String InitString, String[] command) {
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        for (int i = 0; i < InitString.length(); i++) {
            left.push(String.valueOf(InitString.charAt(i)));
        }

        for (String s : command) {
            if ("L".equals(s)) {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if ("R".equals(s)) {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if ("D".equals(s)) {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (s.contains("I ")) {
                if (!right.isEmpty()) {
                    right.pop();
                }
                left.push(String.valueOf(s.charAt(2)));
            } else if (s.contains("P ")) {
                left.push(String.valueOf(s.charAt(2)));
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!right.isEmpty()) {
            stringBuilder.append(right.pop());
        }

        return stringBuilder.toString();
    }
}
