class Tree {
    // Function to delete a node from BST.
    public static Node maxvalue(Node root){
        if(root == null){
            return null;
        }
        
        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        
        return temp;
    }
    
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root == null){
             return root;
        }
        
        if(root.data == X){
            
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null && root.right != null){
                Node childsubTree = root.right;
                return childsubTree;
            }
            else if(root.left != null && root.right == null){
                Node childsubTree = root.left;
                return childsubTree;
            }
            else{
                Node maxi = maxvalue(root.left);
                root.data = maxi.data;
                root.left = deleteNode(root.left, maxi.data);
            }
        }
        else if(root.data > X){
            root.left = deleteNode(root.left, X);
        }
        else{
            root.right = deleteNode(root.right, X);
        }
        
        return root;
    }
}