/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int sumK(Node root, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: one way to have sum = 0 (empty path)
        return dfs(root, 0, k, map);
    }

    private int dfs(Node node, int currSum, int k, HashMap<Integer, Integer> map) {
        if (node == null) return 0;

        currSum += node.data;
        int res = map.getOrDefault(currSum - k, 0);

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        res += dfs(node.left, currSum, k, map);
        res += dfs(node.right, currSum, k, map);

        map.put(currSum, map.get(currSum) - 1); // backtrack

        return res;
    }
}

