import java.util.*;
// GFG https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
public class NmeetingsInOneRoom {
    static class Solution {
        public int maxMeetings(int start[], int end[]) {
            int n = start.length;
            int[][] meet = new int[n][2];

            for (int i = 0; i < n; i++) {
                meet[i][0] = start[i];
                meet[i][1] = end[i];
            }

            Arrays.sort(meet, (a, b) -> a[1] - b[1]);

            int ans = 0;
            int last = -1;

            for (int i = 0; i < n; i++) {
                if (meet[i][0] > last) {
                    ans++;
                    last = meet[i][1];
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] s1 = {1, 3, 0, 5, 8, 5};
        int[] e1 = {2, 4, 6, 7, 9, 9};

        int[] s2 = {10, 12, 20};
        int[] e2 = {20, 25, 30};

        int[] s3 = {1, 2, 3, 4};
        int[] e3 = {2, 3, 4, 5};

        int[] s4 = {1, 1, 1};
        int[] e4 = {2, 3, 4};

        int[] s5 = {5, 4, 3, 2, 1};
        int[] e5 = {6, 5, 4, 3, 2};

        System.out.println(sol.maxMeetings(s1, e1)); // 4
        System.out.println(sol.maxMeetings(s2, e2)); // 2
        System.out.println(sol.maxMeetings(s3, e3)); // 4
        System.out.println(sol.maxMeetings(s4, e4)); // 1
        System.out.println(sol.maxMeetings(s5, e5)); // 1
    }
}
