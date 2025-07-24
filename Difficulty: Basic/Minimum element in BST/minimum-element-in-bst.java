/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        if(root == null) return -1;
        
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }
}