// Leetcode 543. Diameter of Binary Tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class DiameterOfBinaryTree {
    int ans = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }
}

public class Main {
    public static void main(String[] args) {

        // Example 1:
        // Tree: [1,2,3,4,5]
        TreeNode root =
            new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(5)
                ),
                new TreeNode(3)
            );

        Solution sol = new Solution();
        int result = sol.diameterOfBinaryTree(root);

        System.out.println(result); // Expected output: 3
    }
}
