/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static void helper(Node node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans){
        if(node == null) return;
        
        path.add(node.data);
        
        if(node.left == null && node.right == null){
            ans.add(new ArrayList<>(path));
        }
        else{
            helper(node.left, path, ans);
            helper(node.right, path, ans);
        }
        path.remove(path.size() - 1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> currPath = new ArrayList<>();
        helper(root, currPath, ans);
        return ans;
    }
    
}