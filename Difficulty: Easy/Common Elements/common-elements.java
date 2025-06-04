import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency of elements in array a
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Check for common elements in array b
        for (int num : b) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result.add(num);
                freq.put(num, freq.get(num) - 1); // Decrease count
            }
        }

        // Sort the result list
        Collections.sort(result);
        return result;
    }
}
