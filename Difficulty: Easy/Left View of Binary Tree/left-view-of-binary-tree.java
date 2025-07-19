/* A Binary Tree node
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
    // Function to return list containing elements of left view of binary tree.
    void printleftview(Node root, int level, ArrayList<Integer> leftview){
        if(root == null) return;
        
        if(level == leftview.size()){
            leftview.add(root.data);
        }
        
        printleftview(root.left, level + 1, leftview);
        printleftview(root.right, level + 1, leftview);
    }
    
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> leftview = new ArrayList<>();
        printleftview(root, 0, leftview);
        return leftview;
    }
}