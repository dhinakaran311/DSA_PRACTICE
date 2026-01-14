import java.util.*;
// Leetcode 18 - 4Sum
public class FourSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] testNums = {
            {1, 0, -1, 0, -2, 2},
            {2, 2, 2, 2, 2},
            {-3, -1, 0, 2, 4, 5},
            {0, 0, 0, 0},
            {-5, -4, -3, -2, -1, 0, 0, 1, 2, 3, 4, 5}
        };

        int[] targets = {0, 8, 2, 0, 0};

        for (int i = 0; i < testNums.length; i++) {
            System.out.println("Test Case " + (i + 1) + ": " +
                    sol.fourSum(testNums[i], targets[i]));
        }
    }
}

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;
                int right = n-1;

                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;

                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
