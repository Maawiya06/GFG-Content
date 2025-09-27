class Solution {
    int solve(String s1, String s2, int i, int j, int[][] dp){
        if(i == s1.length()){
            return s2.length() - j;
        }
        if(j == s2.length()){
            return s1.length() - i;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 0 + solve(s1, s2, i + 1, j + 1, dp);
        }
        else{
            int replace = 1 + solve(s1, s2, i + 1, j + 1, dp);
            int insert = 1 + solve(s1, s2, i, j + 1, dp);
            int remove = 1 + solve(s1, s2, i + 1, j, dp);
            ans = Math.min(replace, Math.min(insert, remove));
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
    public int editDistance(String s1, String s2) {
        // Code here
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i < s1.length(); i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(s1, s2, 0, 0, dp);
    }
}