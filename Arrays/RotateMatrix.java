import java.util.*;

public class RotateMatrix {

    static void swap(int[][] a, int i, int j, int x, int y) {
        int t = a[i][j];
        a[i][j] = a[x][y];
        a[x][y] = t;
    }

    static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }

        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<r){
                swap(matrix,i,l,i,r);
                l++;
                r--;
            }
        }
    }

    static void print(int[][] a){
        for(int[] r:a){
            for(int x:r) System.out.print(x+" ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Before:");
        print(mat);

        rotate(mat);

        System.out.println("After 90° Rotation:");
        print(mat);
    }
}
