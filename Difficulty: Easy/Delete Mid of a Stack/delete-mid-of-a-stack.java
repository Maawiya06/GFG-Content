// User function Template for Java

class Solution {
    public void deleteMid(Stack<Integer> s) {
        int mid = s.size() / 2;
        deleteHelper(s, mid);
    }

    private void deleteHelper(Stack<Integer> s, int k) {
        if (k == 0) {
            s.pop(); // Middle element
            return;
        }

        int temp = s.pop();
        deleteHelper(s, k - 1);
        s.push(temp);
    }
}

