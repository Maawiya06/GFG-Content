/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    void fun(Node root, Map<Integer, Boolean> visited, boolean[] ans){
        if(root == null) return;
        
        visited.put(root.data, true);
        
        if(root.left == null && root.right == null){
            int xp1 = root.data + 1;
            int xm1 = (root.data - 1 == 0) ? root.data : root.data - 1;
            if(visited.containsKey(xp1) && visited.containsKey(xm1)){
                ans[0] = true;
            }
        }
        fun(root.left, visited, ans);
        fun(root.right, visited, ans);
    }

    public boolean isDeadEnd(Node root) {
        // Code here.
        boolean[] ans = new boolean[1]; // use array to pass by reference
        Map<Integer, Boolean> visited = new HashMap<>();
        visited.put(0, true); // to handle leaf node with value 1
        fun(root, visited, ans);
        return ans[0];
    }
}
