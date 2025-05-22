class Solution {
  public:
    // Function to sort an array using quick sort algorithm.
    void quickSort(vector<int>& arr, int low, int high) {
        // code here
        if(low >= high) return;
        int pivot = high;
        int i = low - 1;
        int j = low;
        
        while(j < pivot){
            if(arr[j] < arr[pivot]){
                ++i;
                swap(arr[i], arr[j]);
            }
            ++j;
        }
         ++i;
         swap(arr[i], arr[pivot]);
         quickSort(arr, low, i - 1);
         quickSort(arr, i + 1, high);
    }

  public:
    // Function that takes last element as pivot, places the pivot element at
    // its correct position in sorted array, and places all smaller elements
    // to left of pivot and all greater elements to right of pivot.
    int partition(vector<int>& arr, int low, int high) {
        // code here
    }
};
