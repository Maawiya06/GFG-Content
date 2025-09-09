// User function Template for Java

class Solution {
    int solve(int n, int k, int[] dp){
        
        if(n == 1){
            return k;
        }
        
        if(n == 2){
            return (k + k * (k - 1));
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        
        dp[n] = (solve(n - 1, k, dp) + solve(n - 2, k, dp)) * (k-1);
        return dp[n];
    }
    int countWays(int n, int k) {
        // code here.
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = solve(n, k, dp);
        return ans;
    }
}
