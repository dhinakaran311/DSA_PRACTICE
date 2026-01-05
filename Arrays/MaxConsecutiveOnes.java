// Leetcode 485. Max Consecutive Ones
public class MaxConsecutiveOnes {

    static int maxConsecutiveOnes(int[] nums) {
        int cnt = 0, max = 0;
        for (int x : nums) {
            if (x == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {1,1,0,1,1,1},
            {1,0,1,1,0,1},
            {1,1,1,1},
            {0,0,0},
            {1}
        };

        for (int[] t : tests) {
            System.out.println(maxConsecutiveOnes(t));
        }
    }
}
