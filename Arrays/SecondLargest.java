//GFG https://www.geeksforgeeks.org/problems/second-largest3735/1

class SecondLargestGFG {
    static int secondLargest(int[] arr) {
        int max = -1, sec = -1;
        for (int x : arr) {
            if (x > max) {
                sec = max;
                max = x;
            } else if (x < max && x > sec) {
                sec = x;
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {12,35,1,10,34,1},
            {10,5,10},
            {10,10,10},
            {1,2},
            {5,4,3,2,1}
        };

        for (int[] t : tests)
            System.out.println(secondLargest(t));
    }
}
