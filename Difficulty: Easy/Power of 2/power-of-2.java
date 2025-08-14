class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n <= 0) return false;
        
        long val = 1;
        while(val < n){
            val *= 2;
        }
        return val ==n;
    }
}