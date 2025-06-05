class Solution {
    public String average(int arr[]) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double avg = (double) sum / arr.length;

        // Round to 2 decimal places and return as String
        return String.format("%.2f", avg);
    }
}
