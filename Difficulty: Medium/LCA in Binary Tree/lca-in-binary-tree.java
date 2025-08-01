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
}*/

class Solution {
    // Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int n1, int n2) {
        // Your code here
        if(root == null){
            return null;
        }
        if(root.data == n1){
            return root;
        }
        if(root.data == n2){
            return root;
        }
        
        Node leftAns = lca(root.left, n1, n2);
        Node rightAns = lca(root.right, n1, n2);
        
        if(leftAns == null && rightAns == null){
            return null;
        }
        else if(leftAns != null && rightAns == null){
            return leftAns;
        }
        else if(leftAns == null && rightAns != null){
            return rightAns;
        }
        else{
            return root;
        }
    }
}