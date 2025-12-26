import java.util.*;
// Leetcode 55. Jump Game
public class JumpGame1 {
    public static boolean canJump(int[] nums) {
        int maxInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxInd) return false;
            maxInd = Math.max(maxInd, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {2,3,1,1,4},
            {3,2,1,0,4},
            {0},
            {2,0,0},
            {1,1,0,1}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + canJump(tests[i]));
        }
    }
}
