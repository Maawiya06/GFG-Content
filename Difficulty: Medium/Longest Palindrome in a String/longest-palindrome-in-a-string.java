class Solution {
    static boolean isPalindrome(int start, int end, String s) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(i, j, s)) {
                    String t = s.substring(i, j + 1);
                    ans = t.length() > ans.length() ? t : ans;
                }
            }
        }
        return ans;
    }
}