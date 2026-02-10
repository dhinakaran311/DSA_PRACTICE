/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
// GFG: https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
class boundaryTraversal {
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        if(root==null)
            return ans;
        if(!isLeaf(root))
            ans.add(root.data);
        leftBound(root.left);
        leafNode(root);
        rightBound(root.right);
        return ans;            
        
        
    }
    boolean isLeaf(Node root){
        return root!=null && root.left==null && root.right==null;
    }
    void leftBound(Node root){
        while(root!=null && !isLeaf(root)){
            ans.add(root.data);
            if(root.left!=null)
                root = root.left;
            else
                root = root.right;
        }
    }
    void rightBound(Node root){
        ArrayList<Integer> temp = new ArrayList<>();
        while(root!=null && !isLeaf(root)){
            temp.add(root.data);
            if(root.right!=null)
                root = root.right;
            else
                root = root.left;
        }
        Collections.reverse(temp);
        ans.addAll(temp);
    }
    void leafNode(Node root){
        if(root!=null){
            if(isLeaf(root))
                ans.add(root.data);
            leafNode(root.left);
            leafNode(root.right);
        }
    }
}