import java.util.*;

class Solution {
    // helper recursive function
    private int dfs(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        int n = triangle.size();

        // base case: last row
        if (i == n - 1) {
            return triangle.get(i).get(j);
        }

        // memoization check
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }

        // move to same index (down)
        int down = dfs(triangle, i + 1, j, dp);

        // move to next index (down-right)
        int diag = dfs(triangle, i + 1, j + 1, dp);

        // store and return
        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diag);
        return dp[i][j];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        // initialize dp with MAX_VALUE
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        return dfs(triangle, 0, 0, dp);
    }
}
