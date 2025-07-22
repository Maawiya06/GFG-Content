class Solution {
    int postIndex = 0;
    
    public int searchInorder(int[] inorder, int target, int size){
        for(int i = 0; i < size; i++){
            if(inorder[i] == target){
                return i;
            }
        }
        return -1;
    }
    Node helper(int[] postorder, int[] inorder, int inOrderStart, int inOrderEnd, int size){
        
        // base case
        if(postIndex < 0 || inOrderStart > inOrderEnd){
            return null;
        }
        
        int element = postorder[postIndex--];
        Node node = new Node(element);
        
        int position = searchInorder(inorder, element, size);
        
        node.right = helper(postorder, inorder, position + 1, inOrderEnd, size);
        node.left = helper(postorder, inorder, inOrderStart, position - 1, size);
        
        return node;
    }
    Node buildTree(int[] inorder, int[] postorder) {
        // code here
        int size = inorder.length;
        postIndex = size - 1;
        return helper(postorder, inorder, 0, size - 1, size);
    }
}