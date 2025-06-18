class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> currentPartition = new ArrayList<>();
        backtrack(s, 0, currentPartition, result);
        return result;
    }

    private void backtrack(String s, int start, ArrayList<String> currentPartition, ArrayList<ArrayList<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentPartition)); // found a valid partition
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String substr = s.substring(start, i + 1);
            if (isPalindrome(substr)) {
                currentPartition.add(substr); // choose
                backtrack(s, i + 1, currentPartition, result); // explore
                currentPartition.remove(currentPartition.size() - 1); // un-choose (backtrack)
            }
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    // Optional: Test it with sample input
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "abcba";
        ArrayList<ArrayList<String>> partitions = sol.palinParts(input);
        System.out.println(partitions);
    }
}
