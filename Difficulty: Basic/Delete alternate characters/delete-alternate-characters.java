// User function template for Java
class Solution {
    static String delAlternate(String S) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < S.length(); i += 2) {
            result.append(S.charAt(i)); // Append characters at even indices
        }

        return result.toString();
    }
}
