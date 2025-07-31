class Solution {
    
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root = null;

    public static Node insert(Node root, int val, int[] succ) {
        if (root == null) return new Node(val);

        if (val >= root.data) {
            root.right = insert(root.right, val, succ);
        } else {
            succ[0] = root.data; // update successor
            root.left = insert(root.left, val, succ);
        }

        return root;
    }

    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        root = null;

        for (int i = n - 1; i >= 0; i--) {
            int[] succ = new int[]{-1}; // wrapper array to act like "pass by reference"
            root = insert(root, arr[i], succ);
            ans.set(i, succ[0]);
        }

        return ans;
    }
}
