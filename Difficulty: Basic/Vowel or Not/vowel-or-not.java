// User function Template for Java
class Solution {
    String isVowel(char c) {
        // Convert to lowercase to handle uppercase input
        c = Character.toLowerCase(c);
        
        // Check if character is a vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }
}

