class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        boolean ans = true;   
        
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1); 
        }
        
        // check all elements in b present in a
        for (int i = 0; i < b.length; i++) {   
            if (!map.containsKey(b[i])) {      
                ans = false;
                break;
            } else {
                if (map.get(b[i]) > 0) {
                    map.put(b[i], map.get(b[i]) - 1);
                } else {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
