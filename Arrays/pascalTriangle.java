import java.util.*;
// Leetcode 118 - Pascal's Triangle 
public class pascalTriangle {

    public static List<Integer> genRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col=1; col<row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            ans.add(genRow(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> res = generate(numRows);

        for(List<Integer> row : res){
            for(int v : row){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
