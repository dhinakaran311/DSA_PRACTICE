import java.util.*;

class PreorderIterative {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) {
            val = v;
        }
    }

    static void preorder(TreeNode root) {
        if(root == null) return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()) {
            TreeNode cur = st.pop();
            System.out.print(cur.val + " ");

            if(cur.right != null)
                st.push(cur.right);
            if(cur.left != null)
                st.push(cur.left);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        preorder(t1); // 1 2 4 5 3

        // Test Case 2
        TreeNode t2 = new TreeNode(10);
        t2.left = new TreeNode(5);
        t2.right = new TreeNode(15);
        preorder(t2); // 10 5 15
    }
}
