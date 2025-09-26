import java.util.*;

class Solution {
    int solve(int[] nums, int index, int sum, int target, int[][] dp) {
        // base case
        if (index == nums.length) {
            return (sum == target) ? 1 : 0;
        }

        // memoization check
        if (dp[index][sum] != -1) {
            return dp[index][sum];
        }

        // include current element
        int include = 0;
        if (sum + nums[index] <= target) {
            include = solve(nums, index + 1, sum + nums[index], target, dp);
        }

        // exclude current element
        int exclude = solve(nums, index + 1, sum, target, dp);

        // store result
        dp[index][sum] = include + exclude;
        return dp[index][sum];
    }

    public int perfectSum(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return solve(nums, 0, 0, target, dp);
    }
}
