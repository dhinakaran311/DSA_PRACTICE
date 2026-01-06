import java.util.*;
// Leetcode 121 Best Time to Buy and Sell Stock
public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {7,1,5,3,6,4},
            {7,6,4,3,1},
            {1},
            {2,4,1},
            {3,3,5,0,0,3,1,4}
        };

        for (int[] t : tests) {
            System.out.println(Arrays.toString(t) + " -> " + maxProfit(t));
        }
    }
}
