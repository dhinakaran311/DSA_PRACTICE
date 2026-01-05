import java.util.*;
// Leetcode 189. Rotate Array
public class RotateArray {

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    static void print(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] tests = {
            {1,2,3,4,5,6,7},
            {-1,-100,3,99},
            {1,2,3,4,5},
            {10},
            {1,1,1,1}
        };

        int[] kVals = {3, 2, 7, 0, 3};

        for (int i = 0; i < tests.length; i++) {
            rotate(tests[i], kVals[i]);
            print(tests[i]);
        }
    }
}
