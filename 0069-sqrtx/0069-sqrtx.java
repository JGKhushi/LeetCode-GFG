class Solution {
    public int mySqrt(int n) {
        if (n == 0 || n == 1) return n;

        long low = 1;
        long high = n;
        int ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long square = mid * mid;

            if (square == n) {
                return (int) mid;
            } else if (square > n) {
                high = mid - 1;
            } else {
                ans = (int) mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}
