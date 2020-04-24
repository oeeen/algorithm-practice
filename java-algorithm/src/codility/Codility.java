package codility;

public class Codility {
    public int solution(int N) {
        int max = 0;
        int curr = 0;

        while((N & 1) != 1) {
            N = N >> 1;
        }
        while(N != 0) {
            N = N >> 1;
            if (curr > max) max = curr;
            if ((N & 1) == 1) curr = 0;
            else curr++;
        }

        return max;
    }
}
