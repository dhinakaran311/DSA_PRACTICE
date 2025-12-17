import java.util.*;

public class KthLargestInStreamData {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public KthLargestInStreamData(int k, int[] nums) {
        this.k = k;
        for (int v : nums) {
            pq.add(v);
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

    // -------- MAIN METHOD FOR LOCAL RUN --------
    public static void main(String[] args) {

        int k = 3;
        int[] nums = {4, 5, 8, 2};

        KthLargestInStreamData obj = new KthLargestInStreamData(k, nums);

        System.out.println(obj.add(3));   // 4
        System.out.println(obj.add(5));   // 5
        System.out.println(obj.add(10));  // 5
        System.out.println(obj.add(9));   // 8
        System.out.println(obj.add(4));   // 8
    }
}
