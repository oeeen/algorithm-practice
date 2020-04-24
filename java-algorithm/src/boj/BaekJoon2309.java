package boj;

import java.util.*;

public class BaekJoon2309 {
    public static void main(String[] args) {
        int[] heights = new int[9];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = scanner.nextInt();
            sum += heights[i];
        }


        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (heights[i] + heights[j]) == 100) {
                    
                }
            }
        }
    }
}
