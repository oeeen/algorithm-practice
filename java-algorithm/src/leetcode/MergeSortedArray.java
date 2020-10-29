package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int totalIndex = m + n - 1;

        while (nums2Index >= 0) {
            if (nums1Index < 0 || nums1[nums1Index] < nums2[nums2Index]) {
                nums1[totalIndex--] = nums2[nums2Index--];
            } else {
                nums1[totalIndex--] = nums1[nums1Index--];
            }
        }
    }
}
