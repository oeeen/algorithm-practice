package programmers.demo;

public class Demo1 {
    public int[] solution(int[][] v) {

        int x = v[0][0] ^ v[1][0] ^ v[2][0];
        int y = v[0][1] ^ v[1][1] ^ v[2][1];

        return new int[]{x, y};
    }
}
