/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// Leetcode: 987 Vertical Order Traversal of a Binary Tree
class verticalTraversal {
    public void preOrder(TreeNode root,int row,int col,ArrayList<int[]> nodes){
        if(root!=null){
        nodes.add(new int[]{col,row,root.val});
        preOrder(root.left,row+1,col-1,nodes);
        preOrder(root.right,row+1,col+1,nodes);
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        ArrayList<int[]> nodes = new ArrayList<>();
        preOrder(root,0,0,nodes);
        nodes.sort((a,b)->{
            if(a[0]!=b[0])
                return Integer.compare(a[0],b[0]);
            else if(a[1]!=b[1])
                return Integer.compare(a[1],b[1]);
            return Integer.compare(a[2],b[2]);
        });
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        List<Integer> level = new ArrayList<>();
        int preCol = Integer.MIN_VALUE;
        for(int[] node:nodes){
            if(node[0]!=preCol){
                if(preCol!=Integer.MIN_VALUE){
                    ans.add(level);
                }
                level = new ArrayList<>();
                preCol = node[0];
            }
            level.add(node[2]);
        }
        ans.add(level);
        return ans;
    }
}