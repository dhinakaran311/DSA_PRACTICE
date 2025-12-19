import java.util.*;
// GFG http://geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
public class FindMinCoins {

    static class Solution {
        public int findMin(int n) {
            int ans = 0;
            int coin = 10;

            while (n > 0) {
                ans += (n / coin);
                n = n % coin;
                coin = coin / 2;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        System.out.println(sol.findMin(27));   // Expected: 5  (10+10+5+1+1)

        // Test case 2
        System.out.println(sol.findMin(0));    // Expected: 0

        // Test case 3
        System.out.println(sol.findMin(3));    // Expected: 2  (2+1)

        // Test case 4
        System.out.println(sol.findMin(15));   // Expected: 2  (10+5)

        // Test case 5
        System.out.println(sol.findMin(99));   // Expected: 14
    }
}
