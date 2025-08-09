// User function Template for Java
class Solution {
    String to_upper(String str) {
        // code here
        char[] chars = str.toCharArray(); 
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i] = (char)(chars[i] - 'a' + 'A');
            }
        }
        
        return new String(chars);
    }
}