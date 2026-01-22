import java.util.*;

class PostorderIterative {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) {
            val = v;x
        }
    }

    static void postorder(TreeNode root) {
        if(root == null) return;

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);

        while(!st1.isEmpty()) {
            TreeNode cur = st1.pop();
            st2.push(cur);

            if(cur.left != null)
                st1.push(cur.left);
            if(cur.right != null)
                st1.push(cur.right);
        }

        while(!st2.isEmpty())
            System.out.print(st2.pop().val + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        postorder(t1); // 4 5 2 3 1

        // Test Case 2
        TreeNode t2 = new TreeNode(7);
        t2.left = new TreeNode(3);
        t2.right = new TreeNode(9);
        postorder(t2); // 3 9 7
    }
}
