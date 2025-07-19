/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    void printleftBoundry(Node root, ArrayList<Integer> res){
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        
        res.add(root.data);
        
        if(root.left != null){
            printleftBoundry(root.left, res);
        }
        else{
            printleftBoundry(root.right, res);
        }
    }
    
    void printleafBoundry(Node root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            res.add(root.data);
            return;
        }
        
        printleafBoundry(root.left, res);
        printleafBoundry(root.right, res);
    }
    
    void printrightBoundry(Node root, ArrayList<Integer> res){
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        
        if(root.right != null){
            printrightBoundry(root.right, res);
        }
        else{
            printrightBoundry(root.left, res);
        }

        res.add(root.data); // add after recursion for reverse order
    }
    
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if (node == null) return res;

        if (!(node.left == null && node.right == null)) {
            res.add(node.data); // add root if not leaf
        }

        printleftBoundry(node.left, res);
        printleafBoundry(node, res);
        printrightBoundry(node.right, res);

        return res;
    }
}
