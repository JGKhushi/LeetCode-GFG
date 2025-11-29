class Solution {

    public int fn(int[][] grid , int[][] dp , int m , int n  ){

        if(m== 0 && n== 0){
             return grid[0][0]; 
        }
        
        if(dp[m][n] != -1){
            return dp[m][n]; 
        }
       
        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;

        if (m > 0) up = grid[m][n] + fn(grid, dp, m-1, n);
        if (n > 0) left = grid[m][n] + fn(grid, dp, m, n-1);
        
        dp[m][n] = Math.min(left , up);
        
        return dp[m][n] ;
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int[][] dp = new int[m][n] ;

        for(int i = 0 ; i <m ; i++){
            Arrays.fill(dp[i] , -1) ; 
        }

        int ans =  fn(grid,dp , m-1 , n-1 );

        return ans ;
    }
}