// User function template for Java
class Solution {
    static String conRevstr(String S1, String S2) {
        // Concatenate the two strings
        String concatenated = S1 + S2;

        // Reverse the concatenated string using StringBuilder
        String reversed = new StringBuilder(concatenated).reverse().toString();

        // Return the reversed string
        return reversed;
    }
}
