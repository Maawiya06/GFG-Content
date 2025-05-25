// User function Template for Java

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n- 1; i++){
            int a = arr[i];
            int b = arr[i + 1];
            int sum = a + b;
            
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
