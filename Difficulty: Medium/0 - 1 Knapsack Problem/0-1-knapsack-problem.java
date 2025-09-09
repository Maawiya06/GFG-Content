class Solution {
    static int solve(int W, int val[], int wt[], int index, int[][] dp){
        
        // base case 
        // if(index == wt.length - 1){ 
        //      if(wt[index] <= W){ 
                 // return val[index]; 
            // } 
             // else{ 
        // return 0; 
        // } 
        // }
        
        // base case
        if(index >= wt.length){
            return 0;
        }
        
        
        if(dp[index][W] != -1){
            return dp[index][W];
        }
        
        // include and exclude
        int include = 0;
        if(wt[index] <= W){
            include = val[index] + solve(W - wt[index], val, wt, index + 1, dp);
        }
        int exclude = solve(W, val, wt, index + 1, dp);
        
        dp[index][W] = Math.max(include, exclude);
        return dp[index][W];
    }

    static int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        int[][] dp = new int[n][W + 1];
        
        // initialize dp with -1
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return solve(W, val, wt, 0, dp);
    }
}
