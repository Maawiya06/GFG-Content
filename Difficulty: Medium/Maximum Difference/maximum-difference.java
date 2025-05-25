import java.util.*;

class Solution {

    public int[] leftSmallerElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public int[] rightSmallerElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public int findMaxDiff(int[] arr) {
        int n = arr.length;
        
        int[] ls = leftSmallerElement(arr);
        int[] rs = rightSmallerElement(arr);
        
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(ls[i] - rs[i]));
        }
        return maxDiff;
    }
}
