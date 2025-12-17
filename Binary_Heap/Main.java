import java.util.*;
//GFG https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int s = 0;

        for (int i : arr)
            pq.add(i);

        while (pq.size() > 1) {
            int t1 = pq.poll();
            int t2 = pq.poll();
            int c = t1 + t2;
            s += c;
            pq.add(c);
        }
        return s;
    }
}

public class Main {
    public static void minimumCostOfRopes(String[] args) {

        int[] arr1 = {4, 3, 2, 6};
        int[] arr2 = {4, 2, 7, 6, 9};
        int[] arr3 = {10};

        System.out.println(Solution.minCost(arr1)); // 29
        System.out.println(Solution.minCost(arr2)); // 62
        System.out.println(Solution.minCost(arr3)); // 0
    }
}
