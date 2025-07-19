/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        TreeMap<Integer, Integer> hdToNodeMap = new TreeMap<>();

        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            Node currentNode = temp.node;
            int hd = temp.hd;

            
            
            hdToNodeMap.put(hd, currentNode.data);
            

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