class Solution {
    static boolean solve(int arr[], int index, int sum1, int sum, int[][] dp){
        if(sum1 == sum) return true;
        if(sum1 > sum || index >= arr.length) return false;
        
        if(dp[index][sum1] != -1){
            return dp[index][sum1] == 1;
        }
        
        boolean include = false;
        if(sum1 + arr[index] <= sum){
            include = solve(arr, index + 1, sum1 + arr[index], sum, dp);
        }
        boolean exclude = solve(arr, index + 1, sum1, sum, dp);
        
        dp[index][sum1] = (include || exclude) ? 1 : 0;
        return include || exclude;
    }

    static boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        int[][] dp = new int[n][sum + 1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(arr, 0, 0, sum, dp);
    }
}
