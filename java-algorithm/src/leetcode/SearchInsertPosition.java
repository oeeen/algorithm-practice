package leetcode;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while ((right - left) >= 1) {
            int mid = (left + right) >> 1;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                if (left == mid) return ++left;
                left = mid;
            } else {
                return mid;
            }
        }
        return left;
    }
}
