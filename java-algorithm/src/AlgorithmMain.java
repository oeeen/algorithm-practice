import programmers.kakao2019intern.Tuple;

public class AlgorithmMain {
    public static void main(String[] args) {
        Tuple sol = new Tuple();

        int[] solution = sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}