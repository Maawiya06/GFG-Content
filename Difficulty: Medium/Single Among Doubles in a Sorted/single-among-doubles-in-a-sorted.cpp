//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    int findOnce(vector<int>& arr) {
        // code here.
        int low = 0, high = arr.size() - 1;
        
        // edge case 
        if(arr.size() == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[high] != arr[high - 1]) return arr[high];
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(mid % 2 == 1) mid--;
            
            // find pairwise
            if(arr[mid] == arr[mid + 1]){
                low = mid + 2;
            }
            else{
                high = mid;
            }
            
            if(low == high) return arr[low];
        }
        return -1;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> a;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            a.push_back(number);
        }

        Solution ob;
        int ans = ob.findOnce(a);
        cout << ans << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends