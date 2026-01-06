// Leetcode 75 Sort Colors
import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {2, 0, 2, 1, 1, 0},
            {2, 0, 1},
            {0},
            {1},
            {2, 2, 1, 1, 0, 0}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Before: " + Arrays.toString(tests[i]));
            sortColors(tests[i]);
            System.out.println("After : " + Arrays.toString(tests[i]));
            System.out.println();
        }
    }
}
