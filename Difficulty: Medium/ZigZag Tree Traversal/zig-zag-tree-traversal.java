/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.
       ArrayList<Integer> ans = new ArrayList<>();
       if(root == null) return ans;
        
        boolean LtoR = true;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int width = q.size();
            ArrayList<Integer> oneLevel = new ArrayList<>(Collections.nCopies(width, 0));
            
            for(int i =0; i < width; i++){
                Node node = q.poll();
                
                int index = LtoR ? i : width - i - 1;
                oneLevel.set(index, node.data);
                
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            
            
            ans.addAll(oneLevel);
            LtoR = !LtoR;
        }
        return ans;
    }
}