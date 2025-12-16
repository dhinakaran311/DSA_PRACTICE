import java.util.*;
// Leetcode QN : 621
public class TaskScheduler {

    static class Solution {
        public int leastInterval(char[] tasks, int n) {
            HashMap<Character, Integer> freq = new HashMap<>();
            for (char t : tasks)
                freq.put(t, freq.getOrDefault(t, 0) + 1);
            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());
            for (int v : freq.values())
                pq.add(v);
            int cycle = n + 1;
            int time = 0;
            while (!pq.isEmpty()) {
                ArrayList<Integer> arr = new ArrayList<>();
                int i = 0;
                while (i < cycle && !pq.isEmpty()) {
                    int f = pq.poll();
                    f--;
                    time++;
                    if (f > 0)
                        arr.add(f);
                    i++;
                }
                if (pq.isEmpty() && arr.isEmpty())
                    break;
                if (pq.isEmpty())
                    time += (cycle - i);
                for (int f : arr)
                    pq.add(f);
            }
            return time;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        char[] t1 = {'A','A','A','B','B','B'};
        int n1 = 2;
        System.out.println(sol.leastInterval(t1, n1)); // 8

        // Test case 2
        char[] t2 = {'A','A','A','B','B','B'};
        int n2 = 0;
        System.out.println(sol.leastInterval(t2, n2)); // 6

        // Test case 3
        char[] t3 = {'A','A','A','A','B','B','C','C','D','D'};
        int n3 = 2;
        System.out.println(sol.leastInterval(t3, n3)); // longer mix

        // Test case 4 (single task type)
        char[] t4 = {'A','A','A','A','A'};
        int n4 = 3;
        System.out.println(sol.leastInterval(t4, n4)); // 17

        // Test case 5 (many types, large input)
        char[] t5 = new char[30];
        for (int i = 0; i < 30; i++)
            t5[i] = (char)('A' + (i % 6));
        int n5 = 4;
        System.out.println(sol.leastInterval(t5, n5));
    }
}
