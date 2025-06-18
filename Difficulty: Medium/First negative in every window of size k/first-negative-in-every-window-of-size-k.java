import java.util.*;

class Solution {
    public static List<Integer> firstNegInt(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        int n = arr.length;

        // Process first window of size k
        for (int index = 0; index < k; index++) {
            if (arr[index] < 0) {
                dq.addLast(index);
            }
        }

        // Add result for the first window
        if (!dq.isEmpty()) {
            result.add(arr[dq.peekFirst()]);
        } else {
            result.add(0);
        }

        // Process remaining windows
        for (int index = k; index < n; index++) {

            // Remove out-of-window elements
            while (!dq.isEmpty() && dq.peekFirst() <= index - k) {
                dq.pollFirst();
            }

            // Add current element if it is negative
            if (arr[index] < 0) {
                dq.addLast(index);
            }

            // Add result
            if (!dq.isEmpty()) {
                result.add(arr[dq.peekFirst()]);
            } else {
                result.add(0);
            }
        }

        return result;
    }
}
