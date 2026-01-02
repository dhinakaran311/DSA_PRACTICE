// GFG Link:
// https://www.geeksforgeeks.org/problems/shortest-job-first/1

import java.util.*;

public class SJF {

    static int solve(int bt[]) {
        int n = bt.length;
        int wait = 0;
        int total_weight = 0;

        Arrays.sort(bt);

        for (int i = 0; i < n; i++) {
            wait += total_weight;
            total_weight += bt[i];
        }

        return wait / n;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {4, 3, 7, 1, 2},
            {1, 2, 3, 4},
            {5, 5, 5, 5},
            {10, 1, 2},
            {8}
        };

        for (int[] t : tests) {
            System.out.println(Arrays.toString(t) + " -> " + solve(t));
        }
    }
}
