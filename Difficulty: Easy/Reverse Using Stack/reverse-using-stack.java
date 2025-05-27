class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
                st.push(S.charAt(i));

        }
        
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        
        return result.toString();
    }
}