package programmers;

public class OneTwoFour {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int[] oneTwoFour = new int[]{4, 1, 2};
        while (n > 0) {
            int remain = n % 3;
            n = (int) Math.ceil(n / 3.0) - 1;
            answer.insert(0, oneTwoFour[remain]);
        }
        return answer.toString();
    }
}
