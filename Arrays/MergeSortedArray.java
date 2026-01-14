import java.util.*;
// Leetcode 88 - Merge Sorted Array
public class MergeSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] nums1Tests = {
            {1,2,3,0,0,0},
            {1},
            {0},
            {2,4,6,0,0,0},
            {1,3,5,7,0,0,0}
        };

        int[] mVals = {3, 1, 0, 3, 4};

        int[][] nums2Tests = {
            {2,5,6},
            {},
            {1},
            {1,3,5},
            {2,4,6}
        };

        int[] nVals = {3, 0, 1, 3, 3};

        for (int i = 0; i < nums1Tests.length; i++) {
            sol.merge(nums1Tests[i], mVals[i], nums2Tests[i], nVals[i]);
            System.out.println("Test Case " + (i + 1) + ": " +
                    Arrays.toString(nums1Tests[i]));
        }
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
