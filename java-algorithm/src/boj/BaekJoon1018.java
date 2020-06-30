package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            String line = stringTokenizer.nextToken();
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                min = Math.min(min, calcPaint(board, i, j));
            }
        }

        System.out.println(min);
    }

    private static int calcPaint(char[][] board, int y, int x) {
        int count = 0;
        for (int i = y; i < y + 8; i++) {
            for (int j = x; j < x + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] == 'W') count++;
                } else {
                    if (board[i][j] == 'B') count++;
                }
            }
        }
        return count > 32 ? 64 - count : count;
    }
}
