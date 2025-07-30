class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        int count = 0;
        int currentSum = 0;

        // base case: prefix sum = 0 has occurred once
        prefixSumFreq.put(0, 1);

        for (int num : arr) {
            currentSum += num;

            // if (currentSum - k) is seen before, it means a subarray sums to k
            if (prefixSumFreq.containsKey(currentSum - k)) {
                count += prefixSumFreq.get(currentSum - k);
            }

            // store/update the frequency of currentSum
            prefixSumFreq.put(currentSum, prefixSumFreq.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}