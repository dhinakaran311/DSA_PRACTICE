import java.util.*;
// Leetcode  1331. Rank Transform of an Array
class Solution {
    public int[] arrayRankTransform(int[] arr) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < arr.length; i++) {
            pq.add(new int[]{arr[i], i});
        }

        int rank = 0;
        int lastVal = Integer.MIN_VALUE;

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int curr = top[0];
            int ind = top[1];

            if (rank == 0 || curr != lastVal) {
                rank++;
            }

            arr[ind] = rank;
            lastVal = curr;
        }

        return arr;
    }
}

public class RankTransform {

    public static void printArr(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        // TEST CASE 1
        int[] a1 = {40, 10, 20, 30};
        printArr(s.arrayRankTransform(a1));

        // TEST CASE 2
        int[] a2 = {100, 100, 100};
        printArr(s.arrayRankTransform(a2));

        // TEST CASE 3
        int[] a3 = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        printArr(s.arrayRankTransform(a3));

        // TEST CASE 4
        int[] a4 = {};
        printArr(s.arrayRankTransform(a4));

        // TEST CASE 5
        int[] a5 = {5, 1, 5, 2, 10};
        printArr(s.arrayRankTransform(a5));
    }
}
