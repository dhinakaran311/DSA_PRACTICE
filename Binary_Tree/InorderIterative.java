import java.util.*;

class InorderIterative {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) {
            val = v;
        }
    }

    static void inorder(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;

        while(cur != null || !st.isEmpty()) {
            while(cur != null) {
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            System.out.print(cur.val + " ");
            cur = cur.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1
        TreeNode t1 = new TreeNode(4);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(6);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(3);
        inorder(t1); // 1 2 3 4 6

        // Test Case 2
        TreeNode t2 = new TreeNode(1);
        t2.right = new TreeNode(2);
        t2.right.right = new TreeNode(3);
        inorder(t2); // 1 2 3
    }
}
