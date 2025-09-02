// User function Template for Java

class Solution {
    public static void preordertraversal(Node root, List<Integer> ans){
        if(root == null) return;
        
        ans.add(root.data);
        preordertraversal(root.left, ans);
        preordertraversal(root.right, ans);
        
    }
    public static void flatten(Node root) {
        // code here
        if(root == null) return;
        
        List<Integer> ans = new ArrayList<>();
        preordertraversal(root, ans);
        
        Node curr = root;
        for(int i = 1; i < ans.size(); i++){
            curr.left = null;
            curr.right = new Node(ans.get(i));
            curr = curr.right;
        }
        
    }
}