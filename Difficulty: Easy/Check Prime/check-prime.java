class Solution {
    public static boolean prime(int n) {
        // Handle edge cases
        if (n <= 1) return false;
        if (n == 2) return true;

        // Check from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
