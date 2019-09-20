import programmers.KthNumber;

public class AlgorithmMain {
    public static void main(String[] args) {
        KthNumber kthNumber = new KthNumber();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = kthNumber.solution(array, command);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
}
