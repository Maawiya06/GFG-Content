class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        int val = helper(root);

        // Special case: if no valid leaf-to-leaf path found (e.g., tree with only one leaf)
        if (root.left == null || root.right == null) {
            maxSum = Math.max(maxSum, val);
        }

        return maxSum;
    }

    private int helper(Node node) {
        if (node == null) return 0;

        // If it's a leaf, return its value
        if (node.left == null && node.right == null) {
            return node.data;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        // If both children exist, we can form a valid path
        if (node.left != null && node.right != null) {
            maxSum = Math.max(maxSum, left + right + node.data);
            return Math.max(left, right) + node.data;
        }

        // If only one child exists, return value from that path
        return (node.left != null ? left : right) + node.data;
    }
}
