class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if(root == null){
            return new Node(Key);
        }
        
        if(Key > root.data){
            root.right = insert(root.right, Key);
        }
        if(Key < root.data){
            root.left = insert(root.left, Key);
        }
        
        return root;
    }
}