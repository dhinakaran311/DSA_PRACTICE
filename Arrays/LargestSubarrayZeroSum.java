// https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

import java.util.*;

public class LargestSubarrayZeroSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] tests = {
            {15, -2, 2, -8, 1, 7, 10, 23},
            {2, 10, 4},
            {1, 0, -4, 3, 1, 0},
            {0, 0, 0, 0},
            {1, -1, 3, -3, 5, -5}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test Case " + (i + 1) + ": " +
                    sol.maxLength(tests[i]));
        }
    }
}

class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(sum == 0)
                max = i + 1;
            else if(map.containsKey(sum))
                max = Math.max(max, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return max;
    }
}
