class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int n = mat.length;
        
        int[] rowsum = new int[n];
        int[] colsum = new int[n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rowsum[i] = rowsum[i] + mat[i][j];
                colsum[j] = colsum[j] + mat[i][j];
            }
        }
        
        // find the max sum
        int maxsum = 0;
        for(int i = 0; i < n; i++){
            maxsum = Math.max(maxsum, rowsum[i]);
            maxsum = Math.max(maxsum, colsum[i]);
        }
        
        // calculate total operation
        int operation = 0;
        for(int i =0; i < n; i++){
            operation += (maxsum - rowsum[i]);
        }
        
        return operation;
    }
}