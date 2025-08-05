class Solution {
    public boolean isPalinSent(String s) {
        // code here
        StringBuilder cleaned = new StringBuilder();

        // Step 1: Clean the string
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Check if cleaned string is palindrome
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}