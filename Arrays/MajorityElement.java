import java.util.*;
// Leetcode 169 Majority Element 
public class MajorityElement {

    // Brute Force O(n^2)
    public static int majorityBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) cnt++;
            }
            if (cnt > n / 2) return nums[i];
        }
        return -1;
    }

    // Optimal O(n) - Boyer Moore Voting Algorithm
    public static int majorityOptimal(int[] nums) {
        int cnt = 0, cand = 0;

        for (int x : nums) {
            if (cnt == 0) cand = x;
            if (x == cand) cnt++;
            else cnt--;
        }
        return cand;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3, 2, 3},
            {2, 2, 1, 1, 1, 2, 2},
            {1},
            {5, 5, 5, 2, 3},
            {-1, -1, -1, 2, -1}
        };

        for (int[] t : tests) {
            System.out.println("Array: " + Arrays.toString(t));
            System.out.println("Brute  : " + majorityBrute(t));
            System.out.println("Optimal: " + majorityOptimal(t));
            System.out.println();
        }
    }
}
