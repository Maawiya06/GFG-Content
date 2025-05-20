import java.util.*;

class Solution {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public Solution() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            int popped = mainStack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int peek() {
        return mainStack.isEmpty() ? -1 : mainStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}
