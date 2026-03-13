class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String ans = str.toString();
        return ans;
    }
}