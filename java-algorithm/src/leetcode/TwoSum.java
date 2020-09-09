package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indices.containsKey(nums[i])) {
                return new int[]{indices.get(nums[i]), i};
            }
            indices.put(target - nums[i], i);
        }
        return null;
    }
}
