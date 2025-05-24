// User function Template for Java
class Solution {
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        insertAtBottom(s, top);
    }

    static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }

        int top = s.pop();
        insertAtBottom(s, x);
        s.push(top);
    }
}
