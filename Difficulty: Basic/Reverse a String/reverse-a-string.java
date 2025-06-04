class Solution {
    public String revStr(String s) {
        // Convert string to char array and reverse manually
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Return the reversed string
        return new String(arr);
    }
}
