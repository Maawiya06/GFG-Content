class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int m = a.length;
        int n = b.length;
        
        if(m > n) return kthElement(b, a, k);
        
        int s = Math.max(0, k - n);
        int e = Math.min(k, m);
        
        while(s <= e){
            int cA = (s + e) / 2;
            int cB = k - cA;
            
            int leftA = (cA == 0) ? Integer.MIN_VALUE : a[cA - 1];
            int leftB = (cB == 0) ? Integer.MIN_VALUE : b[cB - 1];
            
            int rightA = (cA == m) ? Integer.MAX_VALUE : a[cA];
            int rightB = (cB == n) ? Integer.MAX_VALUE : b[cB];
            
            if(leftA <= rightB && leftB <= rightA){
                return Math.max(leftA, leftB);
            }
            else if(leftA > rightB){
                e = cA - 1;
            }
            else{
                s = cA + 1;
            }
        }
        
        return -1;
    }
}