// GFG Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

class largestElementInArray {

    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] t1 = {1, 8, 7, 56, 90};
        int[] t2 = {5, 5, 5, 5};
        int[] t3 = {10};
        int[] t4 = {0, 2, 4, 6, 8};
        int[] t5 = {100, 20, 300, 40, 50};

        System.out.println(largest(t1)); // 90
        System.out.println(largest(t2)); // 5
        System.out.println(largest(t3)); // 10
        System.out.println(largest(t4)); // 8
        System.out.println(largest(t5)); // 300
    }
}
