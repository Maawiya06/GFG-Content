class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        char[] chars = s.toCharArray();
        
        int i = 0;
        int j = s.length() - 1;
        
        while(i <= j){
            if(chars[i] == chars[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}