/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
// GFG: https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1
class topView 
{
    int maxCol = 0;
    int minCol = 0;
    public void preOrder(Node root,int row,int col,HashMap<Integer,int[]> mp){
        if(root!=null){
            if(!mp.containsKey(col) || row<mp.get(col)[1]){
                mp.put(col,new int[]{root.data,row});
            }
            maxCol = Math.max(maxCol,col);
            minCol = Math.min(minCol,col);
            preOrder(root.left,row+1,col-1,mp);
            preOrder(root.right,row+1,col+1,mp);
            
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        HashMap<Integer,int[]> mp = new HashMap<>();
        preOrder(root,0,0,mp);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=minCol;i<=maxCol;i++){
            ans.add(mp.get(i)[0]);
        }
        return ans;
        
    }
}