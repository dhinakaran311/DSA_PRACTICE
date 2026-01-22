// GFG Link: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

import java.util.*;

class repeatingAndMissingNumber {
    ArrayList<Integer> findTwoElement(int[] array) {
        int xr = 0;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            xr ^= array[i];
            xr ^= (i + 1);
        }

        int rsb = xr & -xr;
        int a = 0, b = 0;

        for (int v : array) {
            if ((v & rsb) != 0) a ^= v;
            else b ^= v;
        }

        for (int i = 1; i <= n; i++) {
            if ((i & rsb) != 0) a ^= i;
            else b ^= i;
        }

        int rep = 0, mis = 0;
        for (int v : array) {
            if (v == a) {
                rep = a;
                mis = b;
                break;
            }
            if (v == b) {
                rep = b;
                mis = a;
                break;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(rep);
        res.add(mis);
        return res;
    }
}

public class Main {
    static void run(int[] arr) {
        Solution s = new Solution();
        ArrayList<Integer> r = s.findTwoElement(arr);
        System.out.println("Repeating: " + r.get(0) + ", Missing: " + r.get(1));
    }

    public static void main(String[] args) {
        run(new int[]{1, 3, 3});
        run(new int[]{2, 2});
        run(new int[]{1, 4, 3, 3, 5});
        run(new int[]{5, 3, 4, 1, 1});
        run(new int[]{1, 2, 2, 4, 5, 6, 7});
    }
}
