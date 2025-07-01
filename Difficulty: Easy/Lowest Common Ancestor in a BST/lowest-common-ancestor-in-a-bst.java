/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if(root == null){
            return null;
        }
        if(root == n1){
            return n1;
        }
        if(root == n2){
            return n2;
        }
        
        Node leftAns = LCA(root.left, n1, n2);
        Node rightAns = LCA(root.right, n1, n2);
        
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