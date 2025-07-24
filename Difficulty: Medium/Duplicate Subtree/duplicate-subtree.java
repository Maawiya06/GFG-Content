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
    int ans = 0;
    Map<String, Integer> subTreeMap = new HashMap<>();

    String preorder(Node root) {
        if (root == null) return "#";  

        String left = preorder(root.left);
        String right = preorder(root.right);
        
        String serial = root.data + "," + left + "," + right;

        
        if (!left.equals("#") || !right.equals("#")) {
            subTreeMap.put(serial, subTreeMap.getOrDefault(serial, 0) + 1);
            if (subTreeMap.get(serial) == 2) {
                ans = 1; 
            }
        }

        return serial;
    }

    int dupSub(Node root) {
        preorder(root);
        return ans;
    }
}
