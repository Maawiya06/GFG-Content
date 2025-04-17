//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    int maxLength(string& s) {
        // code here
        stack<int> st;
        st.push(-1);  // base for calculating lengths
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s[i] == '(') {
                st.push(i);  // push index of '('
            } else {
                st.pop();  // pop for ')'
                if(!st.empty()) {
                    maxLen = max(maxLen, i - st.top());
                } else {
                    st.push(i);  // reset base index
                }
            }
        }
        return maxLen;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S;

        Solution ob;
        cout << ob.maxLength(S) << "\n";

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends