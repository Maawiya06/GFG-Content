// User function Template for C++

class Solution {
  public:
    int countDer(int n) {
        
        // base case 
        if(n == 1){
            return 0;
        }
        
        if(n == 2){
            return 1;
        }
        
        // resursive relation 
        int ans = (n-1) * (countDer(n-1) + countDer(n-2));
        return ans;
    }
};
