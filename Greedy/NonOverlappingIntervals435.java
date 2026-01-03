import java.util.*;
// Leetcode 435. Non-overlapping Intervals
public class NonOverlappingIntervals {

    static class Solution {
        public int eraseOverlapIntervals(int[][] inte) {
            if (inte.length == 0) return 0;

            Arrays.sort(inte, (a, b) -> a[1] - b[1]);

            int cnt = 0;
            int last = inte[0][1];

            for (int i = 1; i < inte.length; i++) {
                if (inte[i][0] < last) {
                    cnt++;
                } else {
                    last = inte[i][1];
                }
            }
            return cnt;
        }
    }

    static void print(int[][] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(Arrays.toString(a[i]));
            if (i != a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[][] t1 = {{1,2},{2,3},{3,4},{1,3}};
        print(t1);
        System.out.println(sol.eraseOverlapIntervals(t1));

        // Test case 2
        int[][] t2 = {{1,2},{1,2},{1,2}};
        print(t2);
        System.out.println(sol.eraseOverlapIntervals(t2));

        // Test case 3
        int[][] t3 = {{1,2},{2,3}};
        print(t3);
        System.out.println(sol.eraseOverlapIntervals(t3));

        // Test case 4
        int[][] t4 = {{1,100},{11,22},{1,11},{2,12}};
        print(t4);
        System.out.println(sol.eraseOverlapIntervals(t4));

        // Test case 5
        int[][] t5 = {{-5,-3},{-4,-2},{-1,1}};
        print(t5);
        System.out.println(sol.eraseOverlapIntervals(t5));
    }
}
