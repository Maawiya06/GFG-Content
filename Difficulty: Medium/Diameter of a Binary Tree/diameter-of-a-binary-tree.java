// class Node {
//     int data;
//     Node left, right;
//     Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }

class Height {
    int h;
}

class Solution {
    int diameter(Node root) {
        Height height = new Height();
        return diameterUtil(root, height);
    }

    int diameterUtil(Node root, Height height) {
        if (root == null) {
            height.h = 0;
            return 0;
        }

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        int leftDiameter = diameterUtil(root.left, leftHeight);
        int rightDiameter = diameterUtil(root.right, rightHeight);

        // height of current node
        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;

        // diameter passing through this node
        int currDiameter = leftHeight.h + rightHeight.h;

        return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
    }
}
