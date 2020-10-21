package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int curr = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (curr != nums[i]) {
                curr = nums[i];
                nums[count++] = curr;
            }
        }

        return count;
    }
}
