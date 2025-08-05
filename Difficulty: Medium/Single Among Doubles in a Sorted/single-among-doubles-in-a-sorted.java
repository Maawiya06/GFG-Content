class Solution {
    int single(int[] arr) {
        // code here
        int n = arr.length;
        int s = 0; 
        int e = n - 1;
        
        while(s < e){
            int mid = s + (e -s) / 2;
            
            if(mid % 2 == 1) mid--;
            
            if(arr[mid] == arr[mid + 1]){
                s = mid + 2;
            }
            else{
                e = mid;
            }
        }
        
        return arr[s];
    }
}