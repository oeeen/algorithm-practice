import programmers.kakaoblind.LockAndKey;

public class AlgorithmMain {
    public static void main(String[] args) {
        LockAndKey sol = new LockAndKey();

        System.out.println(sol.solution(new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}}, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}));
    }
}