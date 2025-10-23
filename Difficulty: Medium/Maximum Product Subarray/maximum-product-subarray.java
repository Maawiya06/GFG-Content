class Solution {
    int solve(int[] arr, int index, int[] maxRef, int currMax, int currMin) {
        if (index == arr.length) return maxRef[0];

        int val = arr[index];

        
        if (val < 0) {
            int temp = currMax;
            currMax = currMin;
            currMin = temp;
        }

        currMax = Math.max(val, currMax * val);
        currMin = Math.min(val, currMin * val);

        // update global max
        if (currMax > maxRef[0]) maxRef[0] = currMax;

        return solve(arr, index + 1, maxRef, currMax, currMin);
    }

    int maxProduct(int[] arr) {
        if (arr.length == 0) return 0;
        int[] maxRef = new int[1];
        maxRef[0] = arr[0];
        solve(arr, 1, maxRef, arr[0], arr[0]);
        return maxRef[0];
    }
}
