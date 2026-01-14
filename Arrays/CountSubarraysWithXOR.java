// https://www.geeksforgeeks.org/problems/count-subarrays-with-given-xor/1

import java.util.*;

public class CountSubarraysWithXOR {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] tests = {
            {4, 2, 2, 6, 4},
            {5, 6, 7, 8, 9},
            {1, 1, 1, 1},
            {0, 0, 0},
            {3, 3, 3}
        };

        int[] kVals = {6, 5, 0, 0, 3};

        for (int i = 0; i < tests.length; i++) {
            System.out.println(
                "Test Case " + (i + 1) + ": " +
                sol.subarrayXor(tests[i], kVals[i])
            );
        }
    }
}

class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int xr = 0;
        long cnt = 0;

        for (int v : arr) {
            xr ^= v;
            int need = xr ^ k;

            if (map.containsKey(need))
                cnt += map.get(need);

            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }
}
