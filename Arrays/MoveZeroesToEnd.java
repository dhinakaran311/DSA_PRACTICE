import java.util.*;
// Leetcode 283. Move Zeroes
public class MoveZeroesToEnd {

    static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }

    static void print(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] tests = {
            {0,1,0,3,12},
            {0},
            {1,2,3},
            {0,0,0,1},
            {-1,0,3,0,5}
        };

        for (int[] t : tests) {
            moveZeroes(t);
            print(t);
        }
    }
}
