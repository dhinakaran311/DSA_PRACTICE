// LeetCode 128 - Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;
import java.util.Arrays;

class Solution {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for (int v : nums) {
            set.add(v);
        }

        for (int val : set) {
            if (!set.contains(val - 1)) {
                int curr = val;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    // ---- LOCAL RUN ----
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] tests = {
            {100, 4, 200, 1, 3, 2},
            {0, 3, 7, 2, 5, 8, 4, 6, 0, 1},
            {1, 0, 1, 2},
            {},
            {5}
        };

        for (int[] arr : tests) {
            System.out.println("Input : " + Arrays.toString(arr));
            System.out.println("Output: " + s.longestConsecutive(arr));
            System.out.println();
        }
    }
}
