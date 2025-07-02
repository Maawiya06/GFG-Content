/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {

    static int preIndex = 0;  

    public static int searchInorder(int[] inorder, int target, int size) {
        for (int i = 0; i < size; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static Node helperFunction(int[] preorder, int[] inorder, int inOrderStart, int inOrderEnd, int size) {
        // ✅ Base case
        if (preIndex >= size || inOrderStart > inOrderEnd) {
            return null;
        }

        // ✅ Solve one case
        int element = preorder[preIndex];
        preIndex++;
        Node root = new Node(element);  

        // ✅ Find element in inorder
        int position = searchInorder(inorder, element, size);

        // ✅ Recursive calls
        root.left = helperFunction(preorder, inorder, inOrderStart, position - 1, size);
        root.right = helperFunction(preorder, inorder, position + 1, inOrderEnd, size);

        return root;
    }

    public static Node buildTree(int inorder[], int preorder[]) {
        preIndex = 0; 
        int size = preorder.length;
        return helperFunction(preorder, inorder, 0, size - 1, size);
    }
}