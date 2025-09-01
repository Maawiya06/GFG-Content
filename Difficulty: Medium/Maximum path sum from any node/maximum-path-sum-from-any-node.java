/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    // Function to return maximum path sum from any node in a tree.
    private int maxsum = Integer.MIN_VALUE;
    
    public int sumis(Node node){
        if(node == null) return 0;
        
        int left = Math.max(0, sumis(node.left));
        int right = Math.max(0, sumis(node.right));
        
        maxsum = Math.max(maxsum, left + node.data + right);
        
        return node.data + Math.max(left, right);
    }
    int findMaxSum(Node node) {
        // your code goes here
        sumis(node);
        return maxsum;
    }
}