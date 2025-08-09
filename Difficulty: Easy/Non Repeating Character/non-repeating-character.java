class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        
        char[] freq = new char[26];
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
               return s.charAt(i);
            }
        }
        
        return '$';
    }
}
