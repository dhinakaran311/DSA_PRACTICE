import java.util.*;
// Leetcode 104. Maximum Depth of Binary Tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int v) {
        val = v;
        left = right = null;
    }
}

public class HeightOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

        // Test Case 1
        // Tree: [3,9,20,null,null,15,7]
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);
        System.out.println(maxDepth(t1)); // Expected: 3

        // Test Case 2
        // Tree: [1,null,2]
        TreeNode t2 = new TreeNode(1);
        t2.right = new TreeNode(2);
        System.out.println(maxDepth(t2)); // Expected: 2

        // Test Case 3
        // Single node
        TreeNode t3 = new TreeNode(10);
        System.out.println(maxDepth(t3)); // Expected: 1

        // Test Case 4
        // Left skewed tree
        TreeNode t4 = new TreeNode(1);
        t4.left = new TreeNode(2);
        t4.left.left = new TreeNode(3);
        t4.left.left.left = new TreeNode(4);
        System.out.println(maxDepth(t4)); // Expected: 4

        // Test Case 5
        // Empty tree
        TreeNode t5 = null;
        System.out.println(maxDepth(t5)); // Expected: 0
    }
}
