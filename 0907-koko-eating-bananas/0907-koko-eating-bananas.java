class Solution {
    public static int fn(int[] piles, int h, int low, int high) {
        int n = piles.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoid potential overflow
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += (piles[i] + mid - 1) / mid; // Efficient ceiling
            }
            if (ans <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(piles[i], max);
        }

        return fn(piles, h, 1, max);
    }
}
