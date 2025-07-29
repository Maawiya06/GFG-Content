/*Structure of the Node of the BST is as
class Node
{
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/


class Solution {
    public static int countPairs(Node root1, Node root2, int x) {
        int ans = 0;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        Node a = root1;
        Node b = root2;

        while (true) {
            while (a != null) {
                s1.push(a);
                a = a.left;
            }
            while (b != null) {
                s2.push(b);
                b = b.right;
            }

            if (s1.isEmpty() || s2.isEmpty()) {
                break;
            }

            Node atop = s1.peek();
            Node btop = s2.peek();

            int sum = atop.data + btop.data;

            if (sum == x) {
                ans++;
                s1.pop();
                s2.pop();

                a = atop.right;
                b = btop.left;
            } else if (sum < x) {
                s1.pop();
                a = atop.right;
            } else {
                s2.pop();
                b = btop.left;
            }
        }
        return ans;
    }
}
