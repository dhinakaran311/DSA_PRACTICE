// GFG Problem Link:
// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Solution {

    static ArrayList<Integer> leadersInArray(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[n - 1];
        ans.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    // ---- LOCAL RUN ----
    public static void main(String[] args) {

        int[][] tests = {
            {16, 17, 4, 3, 5, 2},
            {10, 4, 2, 4, 1},
            {5, 10, 20, 40},
            {30, 10, 10, 5}
        };

        for (int[] arr : tests) {
            System.out.println("Input : " + Arrays.toString(arr));
            System.out.println("Leaders: " + leaders(arr));
            System.out.println();
        }
    }
}
