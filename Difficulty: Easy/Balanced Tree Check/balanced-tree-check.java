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
        if(root == null){
            return 0;
        }
        
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int finalAns = Math.max(leftheight, rightheight) + 1;
        return finalAns;
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root == null){
            return true;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int absDiff = Math.abs(leftHeight - rightHeight);
        
        boolean currNodeAbs = (absDiff <= 1);
        
        boolean leftans = isBalanced(root.left);
        boolean rightans = isBalanced(root.right);
        
        if(currNodeAbs && leftans && rightans){
            return true;
        }
        else{
            return false;
        }
    }
}