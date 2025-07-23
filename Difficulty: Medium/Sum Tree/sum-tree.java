/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {

    // Wrapper class to carry result
    class Result {
        boolean isSumTree;
        int sum;

        Result(boolean isSumTree, int sum) {
            this.isSumTree = isSumTree;
            this.sum = sum;
        }
    }

    boolean isSumTree(Node root) {
        return helper(root).isSumTree;
    }

    private Result helper(Node node) {
        // Base case: empty tree
        if (node == null)
            return new Result(true, 0);

        // Leaf node
        if (node.left == null && node.right == null)
            return new Result(true, node.data);

        // Recur for left and right subtree
        Result left = helper(node.left);
        Result right = helper(node.right);

        // Check sum tree condition
        boolean isCurrSumTree = left.isSumTree && right.isSumTree &&
                                (node.data == left.sum + right.sum);

        int totalSum = left.sum + right.sum + node.data;

        return new Result(isCurrSumTree, totalSum);
    }
}
