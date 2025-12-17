import java.util.*;
// Leetcode : 846
public class handOfStraights{

    static class Solution {
        public boolean isNStraightHand(int[] hand, int groupSize) {
            if (hand.length % groupSize != 0)
                return false;

            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int h : hand)
                map.put(h, map.getOrDefault(h, 0) + 1);

            for (int k : map.keySet())
                pq.add(k);

            while (!pq.isEmpty()) {
                int start = pq.peek();

                if (map.get(start) == 0) {
                    pq.poll();
                } else {
                    map.put(start, map.get(start) - 1);

                    for (int i = 1; i < groupSize; i++) {
                        start++;
                        if (!map.containsKey(start) || map.get(start) == 0)
                            return false;
                        map.put(start, map.get(start) - 1);
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1 (example - true)
        int[] h1 = {1,2,3,6,2,3,4,7,8};
        System.out.println(sol.isNStraightHand(h1, 3)); // true

        // Test case 2 (false)
        int[] h2 = {1,2,3,4,5};
        System.out.println(sol.isNStraightHand(h2, 4)); // false

        // Test case 3 (single group)
        int[] h3 = {5,6,7};
        System.out.println(sol.isNStraightHand(h3, 3)); // true

        // Test case 4 (duplicates - true)
        int[] h4 = {1,1,2,2,3,3};
        System.out.println(sol.isNStraightHand(h4, 3)); // true

        // Test case 5 (gap - false)
        int[] h5 = {1,2,4,5,6,7};
        System.out.println(sol.isNStraightHand(h5, 3)); // false
    }
}
