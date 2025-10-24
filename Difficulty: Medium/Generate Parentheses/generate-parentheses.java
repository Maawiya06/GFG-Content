// User function Template for Java

class Solution {
    void solve(int n, int s, int e, String curr, List<String> result){
        if(curr.length() == 2 * n){
            result.add(curr);
            return;
        }
        
        if(s < n){
            solve(n, s + 1, e, curr + "(", result);
        }
        if(e < s){
            solve(n, s, e + 1, curr + ")", result);
        }
    }
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String>ans = new ArrayList<>();
        int numberOfPairs = n / 2;
        solve(numberOfPairs, 0, 0, "", ans);
        return ans;
    }
}