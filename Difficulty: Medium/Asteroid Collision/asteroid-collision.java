// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids){
            boolean destory = false;
            if(ast > 0){
                st.push(ast);
            }
            else{
                if(st.isEmpty() || st.peek() < 0){
                    st.push(ast);
                }
                else{
                    while(!st.isEmpty() && st.peek() > 0){
                        if(Math.abs(ast) == st.peek()){
                            destory = true;
                            st.pop();
                            break;
                        }
                        else if(Math.abs(ast) > st.peek()){
                            st.pop();
                        }
                        else{
                            destory = true;
                            break;
                        }
                    }
                    if(!destory && (st.isEmpty() || st.peek() < 0)){
                        st.push(ast);
                    }
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}
