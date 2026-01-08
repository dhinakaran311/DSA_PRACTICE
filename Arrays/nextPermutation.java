import java.util.Arrays;
// Leetcode 31 Next Permutation
class Solution {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] tests = {
            {1, 2, 3},
            {3, 2, 1},
            {1, 1, 5},
            {1, 3, 2},
            {2, 3, 1}
        };

        for (int[] arr : tests) {
            System.out.println("Before: " + Arrays.toString(arr));
            s.nextPermutation(arr);
            System.out.println("After : " + Arrays.toString(arr));
            System.out.println();
        }
    }
}
