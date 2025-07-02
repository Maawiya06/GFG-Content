/*  A Binary Tree nodea
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
class Tree {
    ArrayList<Integer> result = new ArrayList<>();

    ArrayList<Integer> noSibling(Node node) {
        // Clear result in case of multiple calls
        result.clear();
        
        // Start recursive check
        findNoSiblings(node);

        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }

        return result;
    }

    private void findNoSiblings(Node node) {
        if (node == null) return;

        if (node.left != null && node.right == null) {
            result.add(node.left.data);
        } else if (node.left == null && node.right != null) {
            result.add(node.right.data);
        }

        findNoSiblings(node.left);
        findNoSiblings(node.right);
    }
}
