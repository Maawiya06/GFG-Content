/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            Node temp = q.peek(); q.remove();
            
            while(temp != null){
                
                ans.add(temp.data);
                
                if(temp.left != null){
                    
                    q.add(temp.left);
                }
                temp = temp.right;
            }
        }
        
        return ans;
    }
}