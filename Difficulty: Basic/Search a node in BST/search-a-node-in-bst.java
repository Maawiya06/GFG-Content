class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root == null) return false;
        
        if(root.data == x){
            return true;
        }
        
        boolean leftAns = false;
        boolean rightAns = false;
        if(x > root.data){
            rightAns = search(root.right, x);
        }
        else{
            leftAns = search(root.left, x);
        }
        
        return leftAns || rightAns;
    }
}