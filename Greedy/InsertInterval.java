import java.util.*;
// Leetcode 57. Insert Interval
public class InsertInterval {

    static class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> ans = new ArrayList<>();
            int n = intervals.length;
            int i = 0;

            while (i < n && intervals[i][1] < newInterval[0]) {
                ans.add(intervals[i]);
                i++;
            }

            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                i++;
            }

            ans.add(newInterval);

            while (i < n) {
                ans.add(intervals[i]);
                i++;
            }

            return ans.toArray(new int[ans.size()][2]);
        }
    }

    static void printIntervals(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        int[][] i1 = {{1,3},{6,9}};
        int[] n1 = {2,5};
        printIntervals(sol.insert(i1, n1));

        // Test Case 2
        int[][] i2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] n2 = {4,8};
        printIntervals(sol.insert(i2, n2));

        // Test Case 3
        int[][] i3 = {};
        int[] n3 = {5,7};
        printIntervals(sol.insert(i3, n3));

        // Test Case 4
        int[][] i4 = {{1,5}};
        int[] n4 = {2,3};
        printIntervals(sol.insert(i4, n4));

        // Test Case 5
        int[][] i5 = {{1,5}};
        int[] n5 = {6,8};
        printIntervals(sol.insert(i5, n5));
    }
}
