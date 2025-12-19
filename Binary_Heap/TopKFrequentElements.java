import java.util.*;
// Leetcode  347. Top K Frequent Elements
class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        for (Map.Entry<Integer, Integer> f : freq.entrySet()) {
            pq.add(new int[]{f.getKey(), f.getValue()});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i++] = pq.poll()[0];
        }

        return ans;
    }

    public static void main(String[] args) {

        TopKFrequentElements obj = new TopKFrequentElements();

        // Test Case 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(obj.topKFrequent(nums1, 2)));

        // Test Case 2
        int[] nums2 = {4, 4, 4, 4};
        System.out.println(Arrays.toString(obj.topKFrequent(nums2, 1)));

        // Test Case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(obj.topKFrequent(nums3, 3)));

        // Test Case 4
        int[] nums4 = {5, 5, 6, 6, 6, 7, 7};
        System.out.println(Arrays.toString(obj.topKFrequent(nums4, 2)));

        // Test Case 5
        int[] nums5 = {10, 10, 10, 20, 20, 30};
        System.out.println(Arrays.toString(obj.topKFrequent(nums5, 2)));
    }
}
