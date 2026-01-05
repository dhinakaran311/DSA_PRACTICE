// GFG Problem Link:
// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

import java.util.*;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {
        long prefSum = 0;
        int ans = 0;
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            if (prefSum == k) {
                ans = i + 1;
            }

            if (map.containsKey(prefSum - k)) {
                ans = Math.max(ans, i - map.get(prefSum - k));
            }

            if (!map.containsKey(prefSum)) {
                map.put(prefSum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {10, 5, 2, 7, 1, -10},
            {-5, 8, -14, 2, 4, 12},
            {10, -10, 20, 30},
            {1, -1, 5, -2, 3},
            {3, 1, 0, -1, 8, 2}
        };

        int[] kVals = {15, -5, 5, 3, 7};

        for (int i = 0; i < tests.length; i++) {
            System.out.println(longestSubarray(tests[i], kVals[i]));
        }
    }
}
