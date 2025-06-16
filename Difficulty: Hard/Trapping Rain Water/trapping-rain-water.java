class Solution {
    public int maxWater(int arr[]) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int waterTrapped = 0;
        int current = 0;

        while (current < arr.length) {
            while (!stack.isEmpty() && arr[current] > arr[stack.peek()]) {
                int top = stack.pop(); 
                if (stack.isEmpty()) break;

                int distance = current - stack.peek() - 1;
                int boundedHeight = Math.min(arr[current], arr[stack.peek()]) - arr[top];
                waterTrapped += distance * boundedHeight;
            }
            stack.push(current++);
        }

        return waterTrapped;
    }
}
