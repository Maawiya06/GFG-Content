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
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null) return null;
        if(root.data == n1) return root;
        if(root.data == n2) return root;
        
        Node leftans = lca(root.left, n1, n2);
        Node rightans = lca(root.right, n1, n2);
        
        if(leftans == null && rightans == null){
            return null;
        }
        else if(leftans != null && rightans == null){
            return leftans;
        }
        else if(leftans == null && rightans != null){
            return rightans;
        }
        else{
            return root;
        }
    }
}