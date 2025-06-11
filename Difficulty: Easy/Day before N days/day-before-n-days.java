class Solution {
    public static int nthDay(int d, int n) {
        return (d - (n % 7) + 7) % 7;
    }
}

