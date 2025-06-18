class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (k > q.size()) return q;
        
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        for(int i = 0; i < k; i++){
            int temp = q.poll();
            st.push(temp);
        }
        
        while(!st.isEmpty()){
            int temp = st.pop();
            q.add(temp);
        }
        
        for(int i = 0; i < (n-k); i++){
            int temp = q.poll();
            q.add(temp);
        }
        
        return q;
    }
}