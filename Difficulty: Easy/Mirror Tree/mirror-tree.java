/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    
    void mirror(Node node) {
        // Your code here
        if(node == null){
            return;
        }
        
        mirror(node.left);
        mirror(node.right);
        
        
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}