class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

       
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

       
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (mat[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }

        int mightCeleb = st.pop();

        for (int i = 0; i < n; i++) {
            if (i != mightCeleb && (mat[mightCeleb][i] == 1 || mat[i][mightCeleb] == 0)) {
                return -1;
            }
        }

        return mightCeleb;
    }
}
