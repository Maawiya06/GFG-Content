// User function Template for Java
class Solution {
    public static String utility(int n) {
        // If number of apples is odd, you win
        if (n % 2 == 1) {
            return "You";
        } else {
            return "Friend";
        }
    }
}
