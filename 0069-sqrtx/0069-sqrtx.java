class Solution {
    public int mySqrt(int n) {
        if (n == 0 || n == 1)
            return n;

        int low = 1, high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } else if (square < n) {
                ans = mid;        // store floor(mid) as possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
