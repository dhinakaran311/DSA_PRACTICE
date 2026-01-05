// GFG Problem Link:
// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

import java.util.*;

public class UnionOfTwoSortedArrays {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                add(ans, a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                add(ans, a[i]);
                i++;
            } else {
                add(ans, b[j]);
                j++;
            }
        }

        while (i < a.length) {
            add(ans, a[i]);
            i++;
        }

        while (j < b.length) {
            add(ans, b[j]);
            j++;
        }

        return ans;
    }

    public static void add(ArrayList<Integer> ans, int val) {
        if (ans.size() == 0 || ans.get(ans.size() - 1) != val) {
            ans.add(val);
        }
    }

    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3, 4, 5},
            {2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1}
        };

        int[][] B = {
            {1, 2, 3, 6, 7},
            {1, 1, 2, 3, 4},
            {2, 2, 2, 2, 2}
        };

        for (int i = 0; i < A.length; i++) {
            System.out.println(findUnion(A[i], B[i]));
        }
    }
}
