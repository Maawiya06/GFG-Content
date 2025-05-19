//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function template for C++

class Solution {
  public:
    
    void solve(stack<int>& s, int pos) {
        
        if (pos == 1) {
            s.pop(); 
            return;
        }

        int temp = s.top();
        s.pop();

        solve(s, pos - 1); 

        s.push(temp); 
    }

    void deleteMid(stack<int>& s) {
        int size = s.size();
        int midPos = (size / 2) + 1;
        solve(s, midPos); 
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        string line;
        getline(cin, line);
        stringstream ss(line);
        stack<int> s;
        int num;
        while (ss >> num) {
            s.push(num);
        }

        Solution ob;
        ob.deleteMid(s);
        while (!s.empty()) {
            cout << s.top() << " ";
            s.pop();
        }
        cout << endl;
        cout << "~\n";
    }
    return 0;
}

// } Driver Code Ends