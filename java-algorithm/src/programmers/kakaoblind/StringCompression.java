package programmers.kakaoblind;

public class StringCompression {
    public int solution(String s) {
        int min = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            min = Math.min(min, checkSubString(s, i));
        }

        return min;
    }

    private int checkSubString(String input, int digit) {
        StringBuilder stringBuilder = new StringBuilder();
        String target = input.substring(0, digit);
        int count = 1;
        for (int i = digit; i <= input.length(); i += digit) {
            String current;
            if (i + digit <= input.length()) {
                current = input.substring(i, i + digit);
            } else {
                if (count > 1) {
                    stringBuilder.append(count);
                }
                stringBuilder.append(target);
                stringBuilder.append(input.substring(i));
                break;
            }

            if (target.equals(current)) {
                count++;
            } else {
                if (count > 1) {
                    stringBuilder.append(count);
                }
                stringBuilder.append(target);
                target = current;
                count = 1;
            }
        }

        return stringBuilder.length();
    }

}
