class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int cSum = 0;
        int ans = 0;
        
        for (int i = 0; i < arr.length; i++) {
            cSum = cSum + arr[i];
            
            if (cSum == 0) {
                ans = Math.max(ans, i + 1);
            } 
            else if (map.containsKey(cSum)) {
                ans = Math.max(ans, i - map.get(cSum));
            } 
            else {
                // store sum in map if not already present
                map.put(cSum, i);
            }
        }
        return ans;
    }
}
