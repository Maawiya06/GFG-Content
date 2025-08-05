class Solution {
    
    public long power(int base, int exp){
        long result = 1;
        for(int i =0; i < exp; i++){
            result = result * base;
            if (result > Long.MAX_VALUE) break; 
        }
        
        return result;
    }
    
    
    public int nthRoot(int n, int m) {
        // code here
        
        int low = 1; 
        int high = m;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            
            long pow = power(mid, n);
            
            if(pow == m){
                return mid;
            }
            else if(pow < m){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}