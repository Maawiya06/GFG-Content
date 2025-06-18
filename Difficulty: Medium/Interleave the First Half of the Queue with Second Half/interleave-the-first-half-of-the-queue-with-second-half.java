class Solution {
    
    static void InterleaveQueue(Queue<Integer> firstq) {
        Queue<Integer> secondq = new LinkedList<>(); 

        // Push first half of first queue into second queue
        int size = firstq.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = firstq.poll();
            secondq.add(temp);  // ✅ use add instead of push
        }

        // Merge both halves into the original queue
        for (int i = 0; i < size / 2; i++) {
            int temp = secondq.poll();
            firstq.add(temp);

            temp = firstq.poll();
            firstq.add(temp);
        }
    }
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        InterleaveQueue(q);
        return q;
    }
}
