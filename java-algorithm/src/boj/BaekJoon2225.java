package boj;

import java.util.*;

public class BaekJoon2225 {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] dp = new int[n + 1][k + 1];
        System.out.println(sum(dp, n, k));
    }

    private int sum(int[][] dp, int n, int k) {
        if (n == 1) dp[n][k] = k;
        else if (k == 1) dp[n][k] = 1;
        else if (dp[n][k] == 0) dp[n][k] = sum(dp, n - 1, k) + sum(dp, n, k - 1);
        return dp[n][k] % 1000000000;
    }
}
