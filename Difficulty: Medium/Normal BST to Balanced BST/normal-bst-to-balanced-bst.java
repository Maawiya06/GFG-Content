/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void inorder(Node root, List<Integer> ans){
        if(root == null) return;
        
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
    
    Node buildTree(List<Integer> ans, int s, int e){
        if(s > e) return null;
        
        int mid = (s + e) / 2;
        
        Node root = new Node(ans.get(mid));
        root.left = buildTree(ans, s, mid - 1);
        root.right = buildTree(ans, mid + 1, e);
        return root;
    }
    Node balanceBST(Node root) {
        // Add your code here.
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        
        return buildTree(ans, 0, ans.size() - 1);
    }
}