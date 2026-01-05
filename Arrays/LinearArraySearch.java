// GFG Problem Link:
// https://www.geeksforgeeks.org/problems/array-search/1

public class LinearArraySearch {

    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {1, 2, 3, 4},
            {10, 8, 30, 4, 5},
            {10, 8, 30},
            {5},
            {0, 1, 2, 3}
        };

        int[] xVals = {3, 5, 6, 5, 0};

        for (int i = 0; i < tests.length; i++) {
            System.out.println(search(tests[i], xVals[i]));
        }
    }
}
