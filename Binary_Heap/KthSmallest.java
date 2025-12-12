import java.util.*;
    // Gfg : https://www.geeksforgeeks.org/problems/kth-smallest-element5635/
public class KthSmallest
{

    public static int kthSmallest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : a) {
            pq.add(n);
            if (pq.size() > k) 
                pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[][] t = {
            {7,10,4,3,20,15},
            {1,2,3,4,5},
            {5,5,5,5,5},
            {9,8,7,6,5,4,3},
            {12,3,17,8,34,2}
        };

        int[] k = {3,1,4,2,5};

        for (int i = 0; i < 5; i++) {
            System.out.println(kthSmallest(t[i], k[i]));
        }
    }
}
