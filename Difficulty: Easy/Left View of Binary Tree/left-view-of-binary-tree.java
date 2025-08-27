/*
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
    public void printleftview(Node root, int level, ArrayList<Integer> leftview){
        if(root == null) return;
        
        if(level == leftview.size()){
            leftview.add(root.data);
        }
        
        printleftview(root.left, level + 1, leftview);
        printleftview(root.right, level + 1, leftview);
    }
    ArrayList<Integer> leftView(Node root) {
    //     // code here
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     if(root == null) return ans;
        
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
        
    //     while(!queue.isEmpty()){
    //         int level = queue.size();
            
    //         for(int i = 0; i < level; i++){
    //             Node curr = queue.poll();
                
    //             if(i == 0){
    //                 ans.add(curr.data);
    //             }
    //             if(curr.left != null) queue.add(curr.left);
    //             if(curr.right != null) queue.add(curr.right);
    //         }
    //     }
        
    //     return ans;
    
    ArrayList<Integer> leftview = new ArrayList<>();
    printleftview(root, 0, leftview);
    return leftview;
    }
}