class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class PreOrder {
    public void preOrder(Node node) {
        // TODO: Implement pre-order traversal logic (Root -> Left -> Right)
        if(node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        PreOrder tree = new PreOrder();

        // Test Case 1: Empty Tree
        Node root1 = null;
        System.out.print("Test Case 1 (Empty): ");
        tree.preOrder(root1);
        System.out.println();

        // Test Case 2: Single Node
        Node root2 = new Node(10);
        System.out.print("Test Case 2 (Single Node): ");
        tree.preOrder(root2);
        System.out.println();

        // Test Case 3: Left-skewed Tree
        Node root3 = new Node(1);
        root3.left = new Node(2);
        root3.left.left = new Node(3);
        System.out.print("Test Case 3 (Left-skewed): ");
        tree.preOrder(root3);
        System.out.println();

        // Test Case 4: Right-skewed Tree
        Node root4 = new Node(1);
        root4.right = new Node(2);
        root4.right.right = new Node(3);
        System.out.print("Test Case 4 (Right-skewed): ");
        tree.preOrder(root4);
        System.out.println();

        // Test Case 5: Full Binary Tree
        Node root5 = new Node(1);
        root5.left = new Node(2);
        root5.right = new Node(3);
        root5.left.left = new Node(4);
        root5.left.right = new Node(5);
        root5.right.left = new Node(6);
        root5.right.right = new Node(7);
        System.out.print("Test Case 5 (Full Tree): ");
        tree.preOrder(root5);
        System.out.println();
    }
}
