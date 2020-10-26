package leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        steps[1] = 1;
        steps[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }

        return steps[n];
    }
}
