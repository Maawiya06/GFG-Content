class Solution {
    
    public int[] nextsmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for(int i = n - 1; i >= 0; i--){
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr){
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
        
        return ans;
    }
    
    public int[] previousSmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr){
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
        }
        
        return ans;
    }
    public int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        
        int[] next = nextsmallerElement(arr);
        int[] prev = previousSmallerElement(arr);
        
        for(int i = 0; i < n; i++){
            
            if(next[i] == -1){
                next[i] = n;
            }
        }
        
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            int width = next[i] - prev[i] - 1;
            int length = arr[i];
            int currArea = width * length;
            maxArea = Math.max(maxArea, currArea);
        }
        
        return maxArea;
    }
}
