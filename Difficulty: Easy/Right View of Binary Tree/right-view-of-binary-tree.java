/*
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    public void printrightview(Node root, int level, ArrayList<Integer> rightview){
        if(root == null) return;
        
        if(level == rightview.size()){
            rightview.add(root.data);
        }
        
        printrightview(root.right, level + 1, rightview);
        printrightview(root.left, level + 1, rightview);
    }
    ArrayList<Integer> rightView(Node root) {
        // code here.
        ArrayList<Integer> rightview = new ArrayList<>();
        printrightview(root, 0, rightview);
        return rightview;
    }
}