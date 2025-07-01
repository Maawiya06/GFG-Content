class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    // Static helper to match the static method above
    private static void preorderHelper(Node node, ArrayList<Integer> result) {
        if (node == null) return;

        result.add(node.data);               // Node
        preorderHelper(node.left, result);   // Left
        preorderHelper(node.right, result);  // Right
    }
}
