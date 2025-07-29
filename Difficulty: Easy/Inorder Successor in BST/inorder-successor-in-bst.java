/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        Node succ = null;
        Node curr = root;
        
        while(curr != null){
            if(curr.data > x.data){
                succ = curr;
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        return (succ != null) ? succ.data : -1;
    }
}