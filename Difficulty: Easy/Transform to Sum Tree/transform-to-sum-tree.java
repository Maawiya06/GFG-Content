/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    int sum(Node node){
        if(node == null) return 0;
        
        
        int lsum = sum(node.left);
        int rsum = sum(node.right);
        int temp = node.data;
        node.data = lsum + rsum;
        return node.data + temp;
    }
    public void toSumTree(Node root) {
        // add code here.
        sum(root);
    }
}