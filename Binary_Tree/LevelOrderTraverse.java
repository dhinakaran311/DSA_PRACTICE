import java.util.*;
// Leetcode 102. Binary Tree Level Order Traversal
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) {
        val = v;
        left = right = null;
    }
}

public class LevelOrderTraverse {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int sz = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }

    // Helper to print result
    static void print(List<List<Integer>> res) {
        System.out.println(res);
    }

    public static void main(String[] args) {

        // Test Case 1
        // Tree: [1,2,3]
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        print(levelOrder(t1));

        // Test Case 2
        // Tree: [3,9,20,null,null,15,7]
        TreeNode t2 = new TreeNode(3);
        t2.left = new TreeNode(9);
        t2.right = new TreeNode(20);
        t2.right.left = new TreeNode(15);
        t2.right.right = new TreeNode(7);
        print(levelOrder(t2));

        // Test Case 3
        // Single node
        TreeNode t3 = new TreeNode(10);
        print(levelOrder(t3));

        // Test Case 4
        // Left skewed tree
        TreeNode t4 = new TreeNode(1);
        t4.left = new TreeNode(2);
        t4.left.left = new TreeNode(3);
        t4.left.left.left = new TreeNode(4);
        print(levelOrder(t4));

        // Test Case 5
        // Right skewed tree
        TreeNode t5 = new TreeNode(1);
        t5.right = new TreeNode(2);
        t5.right.right = new TreeNode(3);
        t5.right.right.right = new TreeNode(4);
        print(levelOrder(t5));
    }
}
