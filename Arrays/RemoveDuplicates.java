// Leetcode 26. Remove Duplicates from Sorted Array 

class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1,1,2},
            {0,0,1,1,1,2,2,3,3,4},
            {1,1,1,1},
            {1,2,3,4},
            {5}
        };

        for (int[] t : tests) {
            int k = removeDuplicates(t);
            for (int i = 0; i < k; i++)
                System.out.print(t[i] + " ");
            System.out.println();
        }
    }
}
