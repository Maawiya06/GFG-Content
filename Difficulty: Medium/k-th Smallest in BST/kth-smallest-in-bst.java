// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    int k;
    // Return the Kth smallest element in the given BST
    public int helperfunction(Node root){
        if(root == null){
            return -1;
        }
        
        int leftans = helperfunction(root.left);
        if(leftans != -1){
            return leftans;
        }
        
        this.k--;
        if(this.k == 0){
            return root.data;
        }
        
        int rightans = helperfunction(root.right);
        if(rightans != -1){
            return rightans;
        }
        
        return -1;
        
    }
    public int kthSmallest(Node root, int k) {
        // Write your code here
        this.k = k;
        return helperfunction(root);
    }
}