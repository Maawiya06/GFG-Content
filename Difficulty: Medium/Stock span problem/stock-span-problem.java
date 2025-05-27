
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> sum = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            
            int currspan = st.isEmpty() ? (i + 1) : (i - st.peek());
            sum.add(currspan);
            
            st.push(i);
        }
        return sum;
    }
}