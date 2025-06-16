// User function Template for Java

class Solution {
    public static int profit(int V[]) {
        int n = V.length;
        Stack<Integer> st = new Stack<>();
        int totalProfit = 0;

        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller elements
            while (!st.isEmpty() && st.peek() < V[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                totalProfit += (st.peek() - V[i]);
            } else {
                totalProfit += V[i]; // No greater element found
            }

            st.push(V[i]);
        }

        return totalProfit;
    }
};
