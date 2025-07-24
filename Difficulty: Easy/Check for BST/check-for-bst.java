class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBSTUTIL(Node root, int min, int max){
        if(root == null) return true;
        
        if(root.data <= min || root.data >= max) return false;
        
        return isBSTUTIL(root.left, min, root.data) &&
               isBSTUTIL(root.right, root.data, max);
    }
    boolean isBST(Node root) {
        // code here.
        return isBSTUTIL(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}