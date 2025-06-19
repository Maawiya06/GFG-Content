class Solution {
    public boolean validgroup(int[] arr, int k) {
        
        if (arr.length % k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        while (!map.isEmpty()) {
            int start = map.firstKey();

            for (int i = start; i < start + k; i++) {
                if (!map.containsKey(i)) return false;

                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }

        return true;
        
    }
}