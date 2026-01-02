import java.util.*;
// Leetcode 135. Candy
public class Candy135 {
    static int candy(int[] rat) {
        int n = rat.length;
        if (n == 0) return 0;

        int can = n;
        int i = 1;

        while (i < n) {
            if (rat[i] == rat[i - 1]) {
                i++;
                continue;
            }

            int up = 0;
            while (i < n && rat[i] > rat[i - 1]) {
                up++;
                can += up;
                i++;
            }

            int dn = 0;
            while (i < n && rat[i] < rat[i - 1]) {
                dn++;
                can += dn;
                i++;
            }

            can -= Math.min(up, dn);
        }
        return can;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1, 0, 2},
            {1, 2, 2},
            {1, 3, 4, 5, 2},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 1, 0}
        };

        for (int[] t : tests) {
            System.out.println(Arrays.toString(t) + " -> " + candy(t));
        }
    }
}
