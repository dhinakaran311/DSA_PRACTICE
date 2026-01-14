import java.util.*;
// Leetcode 229 - Majority Element II
public class majorityElement2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 3};
        System.out.println(sol.majorityElement(nums));
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int countCandidate1 = 0;
        int countCandidate2 = 0;

        int candidate1 = 0;
        int candidate2 = 0;

        for (int value : nums) {
            if (value == candidate1) {
                countCandidate1++;
            } else if (value == candidate2) {
                countCandidate2++;
            } else if (countCandidate1 == 0) {
                candidate1 = value;
                countCandidate1 = 1;
            } else if (countCandidate2 == 0) {
                candidate2 = value;
                countCandidate2 = 1;
            } else {
                countCandidate1--;
                countCandidate2--;
            }
        }

        int frequency1 = 0;
        int frequency2 = 0;

        for (int value : nums) {
            if (value == candidate1) {
                frequency1++;
            } else if (value == candidate2) {
                frequency2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        if (frequency1 > n / 3) result.add(candidate1);
        if (frequency2 > n / 3) result.add(candidate2);

        return result;
    }
}
