class Solution {
    public int sumOfMax(int[] arr) {
        // code here
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        
        for(int i=0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            
            left[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        
        st.clear();
        
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            
            right[i] = st.isEmpty() ? (n - i) : (st.peek() - i);
            st.push(i);
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i] * left[i] * right[i];
        }
        
        return sum;
    }
}