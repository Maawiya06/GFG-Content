class Solution {
    String reverseEqn(String S) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        int n = S.length();

        while (i < n) {
            char ch = S.charAt(i);
            
            
            if (Character.isDigit(ch)) {
                StringBuilder number = new StringBuilder();
                while (i < n && Character.isDigit(S.charAt(i))) {
                    number.append(S.charAt(i));
                    i++;
                }
                stack.push(number.toString());
            } 
            else {
                stack.push(String.valueOf(ch));
                i++;
            }
        }

        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
