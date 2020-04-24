package programmers;

import java.util.Arrays;

public class 징검다리 {
    public int solution(int distance, int[] rocks, int n) {
        int left = 0;
        int right = distance;

        Arrays.sort(rocks);

        while ((right - left) > 1) {
            int mid = (left + right) >> 1;
            if (isPossible(rocks, mid, n)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }

    private boolean isPossible(int[] rocks, int distance, int n) {
        int previous = 0;
        int count = 0;
        for (int rock : rocks) {
            if (rock - previous > distance) {
                previous = rock;
            } else {
                count += 1;
            }
        }
        return count <= n;
    }
}
