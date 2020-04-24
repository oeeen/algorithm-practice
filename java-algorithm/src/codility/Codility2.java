package codility;

public class Codility2 {
    public int[] solution(int[] A, int K) {
        int arraySize = A.length;
        int[] ret = new int[arraySize];


        for (int i = 0; i < arraySize; i++) {
            ret[(i + K) % arraySize] = A[i];
        }

        return ret;
    }
}
