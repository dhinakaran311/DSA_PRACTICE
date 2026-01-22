import java.util.*;
// Leetcode 110. Balanced Binary Tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int v) {
        val = v;
        left = right = null;
    }
}

public class BalanceTree {

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        if (left == -1)
            return -1;

        int right = height(root.right);
        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        // Test Case 1 (Balanced)
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        System.out.println(isBalanced(t1)); // true

        // Test Case 2 (Unbalanced)
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.left.left = new TreeNode(3);
        t2.left.left.left = new TreeNode(4);
        System.out.println(isBalanced(t2)); // false

        // Test Case 3 (Single node)
        TreeNode t3 = new TreeNode(10);
        System.out.println(isBalanced(t3)); // true

        // Test Case 4 (Empty tree)
        TreeNode t4 = null;
        System.out.println(isBalanced(t4)); // true

        // Test Case 5 (Right skewed)
        TreeNode t5 = new TreeNode(1);
        t5.right = new TreeNode(2);
        t5.right.right = new TreeNode(3);
        System.out.println(isBalanced(t5)); // false
    }
}
