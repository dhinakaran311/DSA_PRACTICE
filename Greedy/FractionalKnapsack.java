import java.util.*;
// GFG https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
public class FractionalKnapsack {

    static class Solution {
        class ItemNode {
            double val;
            double wt;

            ItemNode(double val, double wt) {
                this.val = val;
                this.wt = wt;
            }
        }

        public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
            int n = val.length;
            ItemNode[] arr = new ItemNode[n];

            for (int i = 0; i < n; i++) {
                arr[i] = new ItemNode(val[i], wt[i]);
            }

            Arrays.sort(arr, (a, b) ->
                Double.compare((b.val / b.wt), (a.val / a.wt))
            );

            double cost = 0;
            int i = 0;

            while (capacity > 0 && i < n) {
                if (arr[i].wt <= capacity) {
                    cost += arr[i].val;
                    capacity -= arr[i].wt;
                } else {
                    cost += (capacity / arr[i].wt) * arr[i].val;
                    break;
                }
                i++;
            }
            return cost;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        System.out.println(sol.fractionalKnapsack(
                new int[]{60, 100, 120},
                new int[]{10, 20, 30},
                50));

        // Test case 2
        System.out.println(sol.fractionalKnapsack(
                new int[]{500},
                new int[]{30},
                10));

        // Test case 3
        System.out.println(sol.fractionalKnapsack(
                new int[]{10, 20, 30},
                new int[]{5, 10, 15},
                20));

        // Test case 4
        System.out.println(sol.fractionalKnapsack(
                new int[]{100, 60, 120},
                new int[]{20, 10, 30},
                40));

        // Test case 5
        System.out.println(sol.fractionalKnapsack(
                new int[]{15, 25, 50},
                new int[]{5, 10, 20},
                25));
    }
}
