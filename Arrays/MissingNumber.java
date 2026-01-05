// Leetcode 268 Missing Number

public class MissingNumber {

    // -------- Method 1: Sum Formula --------
    static int formula(int[] nums) {
        int n = nums.length;
        long sum = (long) n * (n + 1) / 2;
        long cur = 0;

        for (int val : nums) {
            cur += val;
        }
        return (int) (sum - cur);
    }

    // -------- Method 2: XOR --------
    static int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {

        // ---------- Test cases for Formula ----------
        int[][] formulaTests = {
            {3, 0, 1},
            {0, 1},
            {9, 6, 4, 2, 3, 5, 7, 0, 1}
        };

        System.out.println("Sum Formula Method:");
        for (int[] t : formulaTests) {
            System.out.println(formula(t));
        }

        // ---------- Test cases for XOR ----------
        int[][] xorTests = {
            {3, 0, 1},
            {0, 1},
            {9, 6, 4, 2, 3, 5, 7, 0, 1}
        };

        System.out.println("\nXOR Method:");
        for (int[] t : xorTests) {
            System.out.println(missingNumber(t));
        }
    }
}
