package programmers.kakaoblind;

import java.util.Stack;

public class ParenthesisConversion {
    public String solution(String p) {
        return correctString(p);
    }

    private String correctString(String p) {
        if ("".equals(p)) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        String u = "";
        String v = "";
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                u = p.substring(0, i + 1);
                v = p.substring(i + 1);
                break;
            }
        }

        if (checkCorrect(u)) {
            stringBuilder.append(u).append(correctString(v));
        } else {
            stringBuilder.append('(').append(correctString(v)).append(')');
            for (int i = 1; i < u.length() - 1; i++) {
                if (u.charAt(i) == '(') {
                    stringBuilder.append(')');
                } else if (u.charAt(i) == ')') {
                    stringBuilder.append('(');
                }
            }
        }

        return stringBuilder.toString();
    }

    private boolean checkCorrect(String u) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                stack.push('(');
            } else if (!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
