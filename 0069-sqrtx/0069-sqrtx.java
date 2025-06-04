class Solution {
    public int mySqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return (int)mid;
            } else if (square > n) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}
