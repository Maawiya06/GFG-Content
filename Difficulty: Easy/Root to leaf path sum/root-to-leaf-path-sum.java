/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
    boolean solve(Node root, int target, int sum){
        if(root == null){
            return false;
        }
        
        sum = sum + root.data;
        
        if(root.left == null && root.right == null){
            if(sum == target){
                return true;
            }
            else{
                return false;
            }
        }
        
        boolean leftAns = solve(root.left, target, sum);
        boolean rightAns = solve(root.right, target, sum);
        return leftAns || rightAns;
    }
    boolean hasPathSum(Node root, int target) {
        // Your code here
        int sum = 0;
        boolean ans = solve(root, target, sum);
        return ans;
    }
}