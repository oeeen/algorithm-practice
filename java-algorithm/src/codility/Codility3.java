package codility;

public class Codility3 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int ret = 0;
        for (int i : A) {
            ret ^= i;
        }
        return ret;
    }
}
