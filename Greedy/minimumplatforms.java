import java.util.*;
// GFG https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
public class minimumplatforms {

    public static int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int i = 1, j = 0;
        int plat = 1, ans = 1;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat++;
                ans = Math.max(ans, plat);
                i++;
            } else {
                plat--;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {900, 940, 950, 1100, 1500, 1800};
        int[] dep1 = {910, 1200, 1120, 1130, 1900, 2000};

        int[] arr2 = {900, 1100, 1235};
        int[] dep2 = {1000, 1200, 1240};

        int[] arr3 = {100, 200, 300};
        int[] dep3 = {150, 250, 350};

        int[] arr4 = {900, 900, 900};
        int[] dep4 = {910, 910, 910};

        int[] arr5 = {800, 830, 840, 900};
        int[] dep5 = {830, 845, 910, 920};

        System.out.println(minPlatform(arr1, dep1)); // 3
        System.out.println(minPlatform(arr2, dep2)); // 1
        System.out.println(minPlatform(arr3, dep3)); // 1
        System.out.println(minPlatform(arr4, dep4)); // 3
        System.out.println(minPlatform(arr5, dep5)); // 2
    }
}
