class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ']') {
                String stringToRepeat = "";

                while (!st.isEmpty() && (!isSingleDigitString(st.peek()))) {
                    String peek = st.pop();
                    if (!peek.equals("[")) {
                        stringToRepeat = peek + stringToRepeat;
                    }
                }

                String numericTime = "";
                while (!st.isEmpty() && isSingleDigitString(st.peek())) {
                    numericTime = st.pop() + numericTime;
                }

                int n = 0;
                if (!numericTime.isEmpty()) {
                    n = Integer.parseInt(numericTime);
                }

                String currDecode = "";
                while (n-- > 0) {
                    currDecode += stringToRepeat;
                }
                st.push(currDecode);
            } else {
                st.push(String.valueOf(ch));
            }
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }

    // Helper to check if a string is a single digit
    private boolean isSingleDigitString(String s) {
        return s.length() == 1 && Character.isDigit(s.charAt(0));
    }
}
