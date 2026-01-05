import java.util.*;
// Leetcode 136 SingleNumber
public class SingleNumber {

    // Brute Force using HashMap
    static int singleNumberBrute(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : nums)
            mp.put(x, mp.getOrDefault(x, 0) + 1);

        for (int x : nums)
            if (mp.get(x) == 1)
                return x;

        return -1;
    }

    // Optimal XOR method
    static int singleNumberXOR(int[] nums) {
        int xor = 0;
        for (int x : nums)
            xor ^= x;
        return xor;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {2, 2, 1},
            {4, 1, 2, 1, 2},
            {1},
            {5, 3, 5},
            {-1, -1, -2}
        };

        System.out.println("Brute Force Results:");
        for (int[] t : tests)
            System.out.println(singleNumberBrute(t));

        System.out.println("\nOptimal XOR Results:");
        for (int[] t : tests)
            System.out.println(singleNumberXOR(t));
    }
}
