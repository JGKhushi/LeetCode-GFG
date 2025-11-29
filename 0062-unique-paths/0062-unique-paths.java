class Solution {

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        // Base: bottom-right is 1
        dp[m-1][n-1] = 1;

        // Fill last row (right direction only)
        for (int j = n-2; j >= 0; j--) {
            dp[m-1][j] = 1;
        }

        // Fill last column (down direction only)
        for (int i = m-2; i >= 0; i--) {
            dp[i][n-1] = 1;
        }

        // Fill remaining cells bottom-up
        for (int i = m-2; i >= 0; i--) {
            for (int j = n-2; j >= 0; j--) {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}
