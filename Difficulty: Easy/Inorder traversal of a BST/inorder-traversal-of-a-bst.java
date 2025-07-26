class Tree {
    // Function to return a list containing the inorder traversal of the BST.
    void inorderhelper(Node root, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        inorderhelper(root.left, result);
        result.add(root.data);
        inorderhelper(root.right, result);
    }
    ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        inorderhelper(root, result);
        return result;
    }
}