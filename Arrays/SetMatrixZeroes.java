import java.util.*;
// LeetCode 73 - Set Matrix Zeroes
public class SetMatrixZeroes {

    static class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            boolean firstRow = false;
            boolean firstCol = false;

            for(int i = 0; i < m; i++){
                if(matrix[i][0] == 0) firstCol = true;
            }

            for(int j = 0; j < n; j++){
                if(matrix[0][j] == 0) firstRow = true;
            }

            for(int i = 0; i < m; i++){
                for(int j = 1; j < n; j++){
                    if(matrix[i][j] == 0){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            for(int i = 1; i < m; i++){
                for(int j = 1; j < n; j++){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }

            if(firstCol){
                for(int i = 0; i < m; i++){
                    matrix[i][0] = 0;
                }
            }

            if(firstRow){
                for(int j = 0; j < n; j++){
                    matrix[0][j] = 0;
                }
            }
        }
    }

    static void print(int[][] a) {
        for(int[] r : a){
            for(int v : r){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] t1 = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        int[][] t2 = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        int[][] t3 = {
            {1,2,3},
            {4,5,6}
        };

        int[][] t4 = {
            {0,1},
            {2,3}
        };

        int[][] t5 = {
            {1}
        };

        System.out.println("Test 1:");
        s.setZeroes(t1);
        print(t1);

        System.out.println("Test 2:");
        s.setZeroes(t2);
        print(t2);

        System.out.println("Test 3:");
        s.setZeroes(t3);
        print(t3);

        System.out.println("Test 4:");
        s.setZeroes(t4);
        print(t4);

        System.out.println("Test 5:");
        s.setZeroes(t5);
        print(t5);
    }
}
