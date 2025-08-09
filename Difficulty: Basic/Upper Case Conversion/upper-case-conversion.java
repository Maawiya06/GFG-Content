// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            // First letter of the string OR first letter after a space
            if (i == 0 || chars[i - 1] == ' ') {
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    chars[i] = (char)(chars[i] - 'a' + 'A');
                }
            }
        }

        return new String(chars);
    }
}