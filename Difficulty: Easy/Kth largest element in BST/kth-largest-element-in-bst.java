/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    int k;
    public int helperfunction(Node root){
        
        if(root == null){
            return -1;
        }
        
        int rightans = helperfunction(root.right);
        if(rightans != -1){
            return rightans;
        }
        
        this.k--;
        if(this.k == 0){
            return root.data;
        }
        
        int leftans = helperfunction(root.left);
        if(leftans != -1){
            return leftans;
        }
        
        return -1;
    }
    public int kthLargest(Node root, int k) {
        // Your code here
        this.k = k;
        return helperfunction(root);
    }
}