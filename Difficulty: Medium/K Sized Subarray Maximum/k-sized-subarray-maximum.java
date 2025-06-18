class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            // remove element out of this window
            while(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }
            
            // Remove all element smaller then current element from the queue
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.pollLast();
            }
            
            // add current element
            dq.addLast(i);
            
            if(i >= k - 1){
                 result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }
}