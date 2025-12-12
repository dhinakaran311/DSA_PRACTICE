import java.util.*;
//Leetcode 215: Kth Largest Element in an Array
public class findKthLargest {
    public static int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : a) {
            pq.add(i);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[][] t = {
            {3,2,1,5,6,4},
            {3,2,3,1,2,4,5,5,6},
            {1},
            {7,10,4,3,20,15},
            {5,5,5,5,5}
        };

        int[] k = {2,4,1,3,1};

        for (int i = 0; i < 5; i++) {
            System.out.println(findKthLargest(t[i], k[i]));
        }
    }
}
