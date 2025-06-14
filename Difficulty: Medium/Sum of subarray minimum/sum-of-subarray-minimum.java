import java.util.*;

class Solution {
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = (int)1e9 + 7;

        Stack<Integer> stack = new Stack<>();
        int[] prevLess = new int[n];
        int[] nextLess = new int[n];

        // Previous Less Element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevLess[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Less Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextLess[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate result
        long result = 0;
        for (int i = 0; i < n; i++) {
            long count = (long)(i - prevLess[i]) * (nextLess[i] - i) % MOD;
            result = (result + count * arr[i]) % MOD;
        }

        return (int) result;
    }
}
