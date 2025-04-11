//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    // Function to count inversions in the array.
    int merge(vector<int>& arr, vector<int>& temp, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;
        int inv_count = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv_count += (mid - i + 1); // Count inversions
            }
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= end)
            temp[k++] = arr[j++];

        for (i = start; i <= end; i++)
            arr[i] = temp[i];

        return inv_count;
    }
    
    int mergesort(vector<int>& arr, vector<int>& temp, int start, int end) {
        if (start >= end) return 0;
        int mid = start + (end - start) / 2;
        int inv_count = 0;

        inv_count += mergesort(arr, temp, start, mid);
        inv_count += mergesort(arr, temp, mid + 1, end);
        inv_count += merge(arr, temp, start, mid, end);

        return inv_count;
    }
    
    int inversionCount(vector<int> &arr) {
        // Your Code Here
        // int count = 0;
        // for(int i=0; i<arr.size(); i++){
        //     for(int j=i+1; j<arr.size(); j++){
        //         count = arr[i] > arr[j] ? count + 1 : count;
        //     }
        // }
        // return count;
        
        int c = 0;
        vector<int> temp(arr.size(), 0);
        c = mergesort(arr, temp, 0, arr.size() - 1);
        
        // for (int i = 0; i < arr.size(); i++) {
        //     cout << arr[i] << " ";
        // }
        // cout << endl;
        
        return c;
    }
};


//{ Driver Code Starts.

int main() {

    int T;
    cin >> T;
    cin.ignore();
    while (T--) {
        int n;
        vector<int> a;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int num;
        while (ss >> num)
            a.push_back(num);
        Solution obj;
        cout << obj.inversionCount(a) << endl;
        cout << "~" << endl;
    }

    return 0;
}

// } Driver Code Ends