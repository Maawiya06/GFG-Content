// User function Template for Java
class Solution {
    
    Node prev = null;
    Node newRoot = null;
    
    public void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        
        root.left = null;
        
        if(newRoot == null){
            newRoot = root;
        }
        else{
            prev.right = root;
        }
        
        prev = root;
        
        inorder(root.right);
    }
    
    public Node flattenBST(Node root) {
        // Code here
        inorder(root);
        return newRoot;
    }
}
