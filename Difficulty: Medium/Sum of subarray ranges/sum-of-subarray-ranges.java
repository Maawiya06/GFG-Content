class Solution {
    public static long subarrayRanges(int[] arr) {
        // code here
        return sumOfSubarrayMaximums(arr) - sumOfSubarrayMinimums(arr);
    }
    
    private static long sumOfSubarrayMaximums(int[] arr){
        Stack<Integer> st = new Stack<>();
        long res = 0;
        int n = arr.length;
        
        for(int i = 0; i <= n; i++){
            while(!st.isEmpty() && (i == n || arr[st.peek()] < arr[i])){
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                res = res + (long)arr[mid] * (mid - left) * (right - mid);
            }
            st.push(i);
        }
        return res;
    }
    
    private static long sumOfSubarrayMinimums(int[] arr){
        Stack<Integer> st = new Stack<>();
        long res = 0;
        int n = arr.length;
        
        for(int i = 0; i<=n; i++){
            while(!st.isEmpty() && (i == n || arr[st.peek()] > arr[i])){
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                res = res + (long)arr[mid] * (mid - left) * (right - mid);
            }
            st.push(i);
        }
        return res;
    }
}
