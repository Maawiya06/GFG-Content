// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> mapping = new HashMap<>();
        
        int sum = 0;
        int lenMax = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            
            
            if(sum == k){
                lenMax  = i + 1;
            }
            
            if(mapping.containsKey(sum - k)){
                int previousindex = mapping.get(sum - k);
                lenMax = Math.max(lenMax, i - previousindex);
            }
            
            if(!mapping.containsKey(sum)){
                mapping.put(sum, i);
            }
        }
        
        return lenMax;
        
    }
}
