/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int levelsize = q.size();
            ArrayList<Integer> currLevel = new ArrayList<>();
            
            for(int i = 0; i < levelsize; i++){
                Node currNode = q.poll();
                currLevel.add(currNode.data);
                
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
            
            ans.add(currLevel);
        }
        
        return ans;
    }
}