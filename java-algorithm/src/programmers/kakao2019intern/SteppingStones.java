package programmers.kakao2019intern;

public class SteppingStones {
    public int solution(int[] stones, int k) {
        int left = 1;
        int right = 200_000_001;

        while ((right - left) > 1) {
            int mid = (right + left) >> 1;
            if (isPossible(stones, mid, k)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private boolean isPossible(int[] stones, long numPeople, int k) {
        int pre = 0;

        for (int stone : stones) {
            if (stone + 1 <= numPeople) {
                pre += 1;
                if (k <= pre) {
                    return false;
                }
            } else {
                pre = 0;
            }
        }
        return true;
    }
}
