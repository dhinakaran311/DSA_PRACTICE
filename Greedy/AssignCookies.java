import java.util.*;
// Leetcode 455. Assign Cookies
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(sol.findContentChildren(g1, s1)); // 1

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(sol.findContentChildren(g2, s2)); // 2

        int[] g3 = {2, 3, 4};
        int[] s3 = {1, 2, 3};
        System.out.println(sol.findContentChildren(g3, s3)); // 2

        int[] g4 = {1, 1, 1};
        int[] s4 = {1, 1, 1};
        System.out.println(sol.findContentChildren(g4, s4)); // 3

        int[] g5 = {5, 6, 7};
        int[] s5 = {1, 2, 3};
        System.out.println(sol.findContentChildren(g5, s5)); // 0
    }
}
