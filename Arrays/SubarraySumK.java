import java.util.*;

public class SubarraySumK {

    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        int pref = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);

        for(int v : nums){
            pref += v;
            if(mp.containsKey(pref - k)){
                ans += mp.get(pref - k);
            }
            mp.put(pref, mp.getOrDefault(pref, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] a1 = {1,2,3};
        System.out.println(subarraySum(a1, 3));   // 2

        int[] a2 = {1,1,1};
        System.out.println(subarraySum(a2, 2));   // 2

        int[] a3 = {3,4,7,2,-3,1,4,2};
        System.out.println(subarraySum(a3, 7));   // 4

        int[] a4 = {1,2,3,-2,5};
        System.out.println(subarraySum(a4, 3));   // 4

        int[] a5 = {0,0,0,0};
        System.out.println(subarraySum(a5, 0));   // 10
    }
}
