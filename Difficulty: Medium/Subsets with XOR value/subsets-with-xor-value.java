// User function Template for Java

class Solution {
    public static int subsetXOR(int[] arr, int N, int K) {
        int count = 0;
        int totalSubsets = 1 << N; 

        for (int mask = 0; mask < totalSubsets; mask++) {
            int xor = 0;
            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    xor ^= arr[i];
                }
            }
            if (xor == K) {
                count++;
            }
        }

        return count;
    }
}
