/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public boolean isMirror(Node p, Node q){
        if(p == null && q == null) return true;
        
        if(p != null && q != null){
            return (p.data == q.data)
                   && isMirror(p.left, q.right)
                   && isMirror(p.right, q.left);
        }
        
        return false;
    }
    public boolean isSymmetric(Node root) {
        // Code here
        return isMirror(root.left, root.right);
    }
}