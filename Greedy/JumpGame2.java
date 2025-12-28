import java.util.*;
// Leetcode 45. Jump Game II
public class JumpGame2 {

    public static int jump(int[] a) {
        int mx = 0, jm = 0, ce = 0;
        for (int i = 0; i < a.length - 1; i++) {
            mx = Math.max(mx, i + a[i]);
            if (i == ce) {
                jm++;
                ce = mx;
            }
        }
        return jm;
    }

    public static void main(String[] args) {
        int[][] tc = {
            {2,3,1,1,4},
            {2,3,0,1,4},
            {1,1,1,1},
            {10,1,1,1,1},
            {1}
        };

        for (int i = 0; i < tc.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + jump(tc[i]));
        }
    }
}
