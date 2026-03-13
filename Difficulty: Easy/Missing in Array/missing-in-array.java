class Solution {
    int missingNum(int arr[]) {
        int xor = 0;
        int n = arr.length;

        for(int i = 1; i <= n + 1; i++){
            xor ^= i;
        }

        for(int num : arr){
            xor ^= num;
        }

        return xor;
    }
}