class Solution {
    
    // Push back
    public static void pb(ArrayDeque<Integer> dq, int x) {
        dq.addLast(x); // same as dq.offerLast(x)
    }

    // Pop back
    public static void ppb(ArrayDeque<Integer> dq) {
        if (!dq.isEmpty()) {
            dq.pollLast(); // removes from back
        }
    }

    // Return front element
    public static int front_dq(ArrayDeque<Integer> dq) {
        if (!dq.isEmpty()) {
            return dq.peekFirst();
        }
        return -1; // or throw exception based on requirements
    }

    // Push front
    public static void pf(ArrayDeque<Integer> dq, int x) {
        dq.addFirst(x); // same as dq.offerFirst(x)
    }
}
