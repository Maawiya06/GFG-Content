import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length; 
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n]; 

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            while (!st.isEmpty() && st.peek() <= arr[index]) {
                st.pop();
            }

            if (i < n) {
                ans[index] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(arr[index]);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : ans) {
            result.add(num);
        }

        return result;
    }
}
