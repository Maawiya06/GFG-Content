class Solution {
  public:
  vector<int> solve(vector<int>& arr, int target, int i, int j, int sum) {
    // Base case: If j reaches the end and no subarray is found
    if (j == arr.size()) {
        return {-1};
    }

    // Update current sum
    sum += arr[j];

    // Shrink the window if sum exceeds target
    while (sum > target && i <= j) {
        sum -= arr[i];
        i++;
    }

    // If sum matches target, return 1-based indices
    if (sum == target) {
        return {i + 1, j + 1};
    }

    // Recursive call to extend the subarray
    return solve(arr, target, i, j + 1, sum);
}

vector<int> subarraySum(vector<int>& arr, int target) {
    return solve(arr, target, 0, 0, 0);
}
};
