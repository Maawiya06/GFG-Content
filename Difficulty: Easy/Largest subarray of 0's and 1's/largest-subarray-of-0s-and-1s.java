class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int cSum = 0;
        int ans = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            //
            int val = arr[i] == 0 ? -1 : 1;
            
            cSum = cSum + val;
            
            if(cSum == 0){
                ans = Math.max(ans, i + 1);
            }
            else if(map.containsKey(cSum)){
                ans = Math.max(ans, i - map.get(cSum));
            }
            else{
                map.put(cSum, i);
            }
        }
        
        return ans;
    }
}