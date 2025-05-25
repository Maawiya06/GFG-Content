class Solution {
    public int countMinReversals(String s) {
        if (s.length() % 2 == 1) return -1; 

        int ans = 0;
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                st.push(ch);
            } else {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        
        while (!st.isEmpty()) {
            char a = st.pop();
            char b = st.pop();

            if (a == b) {
                ans = ans + 1;
            } else {
                ans = ans + 2;
            }
        }

        return ans;
    }
}
