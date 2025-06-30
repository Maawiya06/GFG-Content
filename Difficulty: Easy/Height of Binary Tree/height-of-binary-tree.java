/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        
        if(node == null){
            return -1;
        }
        
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int height1 = Math.max(leftHeight, rightHeight) + 1;
        return height1;
    }
}