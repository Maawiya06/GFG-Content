import java.util.*;

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        TreeMap<Integer, Integer> hdToNodeMap = new TreeMap<>();

        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            Node currentNode = temp.node;
            int hd = temp.hd;

            
            if (!hdToNodeMap.containsKey(hd)) {
                hdToNodeMap.put(hd, currentNode.data);
            }

            if (currentNode.left != null) {
                q.add(new Pair(currentNode.left, hd - 1));
            }

            if (currentNode.right != null) {
                q.add(new Pair(currentNode.right, hd + 1));
            }
        }

       
        for (int val : hdToNodeMap.values()) {
            result.add(val);
        }

        return result;
    }

    
    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
