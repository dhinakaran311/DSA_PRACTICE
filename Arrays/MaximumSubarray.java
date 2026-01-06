import java.util.*;
// Leetcode 53 Maximum Subarray
public class MaximumSubarray {

    // Brute Force O(n^2)
    public static int maxSubArrayBrute(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    // Optimal O(n) - Kadane's Algorithm
    public static int maxSubArrayOptimal(int[] nums) {
        int cur = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {-2,1,-3,4,-1,2,1,-5,4},
            {1},
            {5,4,-1,7,8},
            {-1,-2,-3},
            {3,-1,2,-1}
        };

        for (int[] t : tests) {
            System.out.println("Array : " + Arrays.toString(t));
            System.out.println("Brute : " + maxSubArrayBrute(t));
            System.out.println("Kadane: " + maxSubArrayOptimal(t));
            System.out.println();
        }
    }
}
