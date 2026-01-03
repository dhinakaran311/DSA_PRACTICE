import java.util.*;
// Leetcode 56. Merge Intervals
public class MergeIntervals {

    static class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            ArrayList<int[]> ans = new ArrayList<>();

            ans.add(intervals[0]);

            for (int i = 1; i < intervals.length; i++) {
                int[] last = ans.get(ans.size() - 1);

                if (intervals[i][0] <= last[1]) {
                    last[1] = Math.max(last[1], intervals[i][1]);
                } else {
                    ans.add(intervals[i]);
                }
            }

            return ans.toArray(new int[ans.size()][2]);
        }
    }

    static void print(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[][] t1 = {{1,3},{2,6},{8,10},{15,18}};
        print(sol.merge(t1));

        // Test case 2
        int[][] t2 = {{1,4},{4,5}};
        print(sol.merge(t2));

        // Test case 3
        int[][] t3 = {{1,10},{2,3},{4,5},{6,7}};
        print(sol.merge(t3));

        // Test case 4
        int[][] t4 = {{1,2},{3,4},{5,6}};
        print(sol.merge(t4));

        // Test case 5
        int[][] t5 = {{5,7},{1,3},{2,6}};
        print(sol.merge(t5));
    }
}
