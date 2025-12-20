import java.util.*;
// Leetcode 860. Lemonade Change
public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for (int v : bills) {
            if (v == 5) {
                f++;
            } else if (v == 10) {
                if (f == 0) return false;
                f--;
                t++;
            } else {
                if (t > 0 && f > 0) {
                    t--;
                    f--;
                } else if (f >= 3) {
                    f -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tc = {
            {5,5,5,10,20},
            {5,5,10},
            {10,10},
            {5,5,5,5,20,20,20},
            {5,10,5,10,20}
        };

        for (int i = 0; i < tc.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + lemonadeChange(tc[i]));
        }
    }
}
