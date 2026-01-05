// Leetcode  1752. Check if Array Is Sorted and Rotated

class CheckSorted {
    static boolean check(int[] nums) {
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) 
                cnt++;
            if (cnt > 1) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3,4,5,1,2},
            {2,1,3,4},
            {1,2,3},
            {1,1,1},
            {2,3,4,5,1}
        };

        for (int[] t : tests)
            System.out.println(check(t));
    }
}
