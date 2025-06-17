class Solution {
    // Function to reverse the queue.
    
    // this is for recursion
    
    // void reverseQ(Queue<Integer> q){
    //     if(q.isEmpty()){
    //         return;
    //     }
        
    //     int element = q.poll();
        
    //     reverseQ(q);
        
    //     q.add(element);
    // }
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Dequeue all elements and push onto stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop all elements from stack and enqueue back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}