class Solution {
    public int solve(int arr[]){
        int n = arr.length;
        
        int dp[] = new int[n + 1];
        
        dp[n - 1] = arr[n - 1];
        
        for(int index = n - 2; index >= 0; index--){
            int include = arr[index] + (index + 2 < n ? dp[index + 2] : 0);
            int exclude = dp[index + 1];
            dp[index] = Math.max(include, exclude);
        }
        
        return dp[0];
    }
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        return solve(arr);
    }
}