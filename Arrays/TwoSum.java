import java.util.*;
// Leetcode 1.Two Sum
public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    static void print(int[] res) {
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }

    public static void main(String[] args) {

        int[][] tests = {
            {2, 7, 11, 15},
            {3, 2, 4},
            {3, 3},
            {1, 5, 7, -2},
            {-1, -2, -3, -4, -5}
        };

        int[] targets = {9, 6, 6, 3, -8};

        for (int i = 0; i < tests.length; i++) {
            int[] ans = twoSum(tests[i], targets[i]);
            print(ans);
        }
    }
}
