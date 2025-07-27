// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {

    int index = 0;

    public Node buildBST(int[] pre, int bound) {
        if (index >= pre.length || pre[index] > bound) {
            return null;
        }

        Node root = new Node(pre[index++]);

        root.left = buildBST(pre, root.data);     
        root.right = buildBST(pre, bound);        

        return root;
    }

    public Node Bst(int pre[], int size) {
        index = 0;
        return buildBST(pre, Integer.MAX_VALUE);
    }
}
