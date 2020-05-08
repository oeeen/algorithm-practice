package programmers.kakao2019intern;

import java.util.Stack;

public class CraneGame {
    public int solution(int[][] board, int[] moves) {
        int removed = 0;
        int boardLength = board.length;
        int[][] swappedBoard = new int[boardLength][boardLength];

        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                swappedBoard[j][i] = board[i][j];
            }
        }


        Stack<Integer> basket = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < boardLength; j++) {
                int currentDoll = swappedBoard[move - 1][j];
                if (currentDoll != 0) {
                    if (basket.isEmpty() || basket.peek() != currentDoll) {
                        basket.push(currentDoll);
                    } else {
                        basket.pop();
                        removed += 2;
                    }
                    swappedBoard[move - 1][j] = 0;
                    break;
                }
            }
        }
        return removed;
    }
}
