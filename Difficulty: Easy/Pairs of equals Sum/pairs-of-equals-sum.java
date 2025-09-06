// User function Template for Java

class Solution {
    public boolean findPairs(int arr[]) {
        // code here.
        Map<Integer, Boolean> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(map.containsKey(sum)){
                    return true;
                }
                else{
                    map.put(sum, true);
                }
            }
        }
        return false;
    }
}