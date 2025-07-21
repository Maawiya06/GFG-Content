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
    static class Tuple {
        Node node;
        int col;

        Tuple(Node node, int col) {
            this.node = node;
            this.col = col;
        }
    }

    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0));

        while (!q.isEmpty()) {
            Tuple t = q.poll();
            Node node = t.node;
            int col = t.col;

            map.computeIfAbsent(col, x -> new ArrayList<>()).add(node.data);

            if (node.left != null)
                q.add(new Tuple(node.left, col - 1));
            if (node.right != null)
                q.add(new Tuple(node.right, col + 1));
        }

        for (ArrayList<Integer> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }
}
