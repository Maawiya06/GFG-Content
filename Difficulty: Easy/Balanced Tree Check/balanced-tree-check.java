/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    int height(Node root){
        if(root == null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        int maxheight = Math.max(left, right) + 1;
        return maxheight;
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root == null) return true;
        
        int lefth = height(root.left);
        int righth = height(root.right);
        int maxdiff = Math.abs(lefth - righth);
        
        boolean currNodeans = (maxdiff <= 1);
        
        boolean leftkaans = isBalanced(root.left);
        boolean rightkaans = isBalanced(root.right);
        
        if(currNodeans && leftkaans && rightkaans){
            return true;
        }
        else{
            return false;
        }
    }
}