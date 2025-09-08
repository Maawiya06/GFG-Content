class Solution {
    
    public int solve(int coins[], int sum, int[] dp){
        // base case
        if(sum == 0){
            return 0;
        }
        
        if(dp[sum] != -1){
            return dp[sum];
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++){
            int coin = coins[i];
            
            if(coin <= sum){
               int recAns = solve(coins, sum - coin, dp);
            
               if(recAns != Integer.MAX_VALUE){
                    int ans = 1 + recAns;
                    min = Math.min(min, ans);
               }
            }
        }
        
        dp[sum] = min;
        return dp[sum];
    }
    public int minCoins(int coins[], int sum) {
        // code here
        int n = sum;
        int dp[] = new int[n + 1];
        
        Arrays.fill(dp, -1);
        
        int ans = solve(coins, sum, dp);
        
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
}