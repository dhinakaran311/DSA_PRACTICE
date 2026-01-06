import java.util.*;
// Leetcode 2149 Rearrange Array Elements by Sign
public class RearrangeArrayBySign {

    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for (int val : nums) {
            if (val > 0) {
                ans[pos] = val;
                pos += 2;
            } else {
                ans[neg] = val;
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3,1,-2,-5,2,-4},
            {-1,1},
            {1,-1,2,-2},
            {5,-3,4,-2,6,-1}
        };

        for (int[] t : tests) {
            System.out.println("Input : " + Arrays.toString(t));
            System.out.println("Output: " + Arrays.toString(rearrangeArray(t)));
            System.out.println();
        }
    }
}
