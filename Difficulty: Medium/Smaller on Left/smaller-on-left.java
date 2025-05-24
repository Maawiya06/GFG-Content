class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int n = arr.length;
        int[] ans = new int[n];
        
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            
            while(st.peek() >= curr){
                st.pop();
            }
            
            ans[i] = st.peek();
            
            st.push(curr);
        }
        
        return ans;
        
    }
}
