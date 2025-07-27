/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    void storeInorder(Node root, List<Integer> inorder){
        if(root == null) return;
        
        storeInorder(root.left, inorder);
        inorder.add(root.data);
        storeInorder(root.right, inorder);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        List<Integer> inorder = new ArrayList<>();
        storeInorder(root, inorder);
        
        // 2 pointer here 
        int s = 0;
        int e = inorder.size() - 1;
        
        while(s < e){
            int sum = inorder.get(s) + inorder.get(e);
            
            if(sum == target){
                return true;
            }
            else if(sum > target){
                e--;
            }
            else if(sum < target){
                s++;
            }
        }
        return false;
    }
}