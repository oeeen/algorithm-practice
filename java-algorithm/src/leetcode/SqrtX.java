package leetcode;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;

        while (left < right) {
            int mid = ((left + right) >> 1) + 1;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
