import java.util.*;
//GFG https://www.geeksforgeeks.org/problems/maximum-sum-combination/1
class MaximumSumCombination
 {

    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {

        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (x, y) -> Integer.compare(y[0], x[0])
        );

        pq.add(new int[]{a[n - 1] + b[n - 1], n - 1, n - 1});

        HashSet<String> vis = new HashSet<>();
        vis.add((n - 1) + "," + (n - 1));

        ArrayList<Integer> ans = new ArrayList<>();

        while (k-- > 0 && !pq.isEmpty()) {

            int[] cur = pq.poll();
            int sum = cur[0];
            int i = cur[1];
            int j = cur[2];

            ans.add(sum);

            if (i - 1 >= 0) {
                String key = (i - 1) + "," + j;
                if (!vis.contains(key)) {
                    pq.add(new int[]{a[i - 1] + b[j], i - 1, j});
                    vis.add(key);
                }
            }

            if (j - 1 >= 0) {
                String key = i + "," + (j - 1);
                if (!vis.contains(key)) {
                    pq.add(new int[]{a[i] + b[j - 1], i, j - 1});
                    vis.add(key);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] a = {1, 4, 2, 3};
        int[] b = {2, 5, 1, 6};
        int k = 3;

        ArrayList<Integer> res = obj.topKSumPairs(a, b, k);
        System.out.println(res);
    }
}
