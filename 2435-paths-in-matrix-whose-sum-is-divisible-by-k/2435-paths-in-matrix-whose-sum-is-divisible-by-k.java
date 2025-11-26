class Solution {

    static final int MOD = 1000000007;

    public int fn(int[][] grid, int[][][] dp, int k, int i, int j, int mod) {
        int m = grid.length, n = grid[0].length;

        // Out of bounds
        if (i >= m || j >= n) return 0;

        // Update mod with current cell
        mod = (mod + grid[i][j]) % k;

        // Destination reached
        if (i == m - 1 && j == n - 1) {
            return (mod == 0 ? 1 : 0);  // divisible by k
        }

        // Memoized
        if (dp[i][j][mod] != -1) {
            return dp[i][j][mod];
        }

        // Move right
        int right = fn(grid, dp, k, i, j + 1, mod);

        // Move down
        int down = fn(grid, dp, k, i + 1, j, mod);

        // Store and return (remember MOD)
        dp[i][j][mod] = (int)((right + down) % MOD);
        return dp[i][j][mod];
    }

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        // 3D DP for (i, j, mod value)
        int dp[][][] = new int[m][n][k];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dp[i][j], -1);

        return fn(grid, dp, k, 0, 0, 0);
    }
}
