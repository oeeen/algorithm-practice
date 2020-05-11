package programmers;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == -1 && reserve[j] == -1) {
                    continue;
                }
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                }
            }
        }

        for (int value : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (value == -1 || reserve[j] == -1) {
                    continue;
                }

                if (value == reserve[j]) {
                    reserve[j] = -1;
                    answer++;
                    break;
                } else if (Math.abs(value - reserve[j]) == 1) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
