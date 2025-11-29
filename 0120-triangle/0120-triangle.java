class Solution {

    public int fn(List<List<Integer>> triangle, int[][] dp, int i, int j) {
        int n = triangle.size();

        // base case: last row
        if (i == n - 1) {
            return triangle.get(i).get(j);
        }

        // memo check
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }

        int down = fn(triangle, dp, i + 1, j);         // move to same index
        int diag = fn(triangle, dp, i + 1, j + 1);     // move to next index

        // store answer
        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diag);

        return dp[i][j];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp = new int[n][n];

        // initialize dp with sentinel (meaning "not computed")
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        return fn(triangle, dp, 0, 0);
    }
}
