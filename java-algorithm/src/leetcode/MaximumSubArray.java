package leetcode;

/**
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int[] maxSubArraySum = new int[nums.length];
        maxSubArraySum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSubArraySum[i] = Math.max(maxSubArraySum[i - 1] + nums[i], nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i : maxSubArraySum) {
            if (max < i) max = i;
        }

        return max;
    }
}
