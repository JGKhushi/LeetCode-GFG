class Solution {

    public int solve(int[][] grid ,int[][] dp , int m , int n  , int sum){
        if(m == 0 && n== 0){
            return grid[0][0] ;
        }
          if (m< 0 || n < 0)
            return (int) 1e9;
            
        if(dp[m][n] != Integer.MAX_VALUE){
            return  dp[m][n];
        }

        int left = 0 ;
        int up = 0 ;
        
            up = grid[m][n] + solve(grid , dp , m , n - 1 , sum);       
       
           left  = grid[m][n] +solve(grid , dp , m-1 , n , sum);
        


        dp[m][n] = Math.min(left , up);

        return dp[m][n] ;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        for(int i  = 0 ; i < m ; i++){
            Arrays.fill(dp[i] , Integer.MAX_VALUE) ;
        }
        int ans = solve(grid , dp , m -1, n-1 , 0 );

        return ans ;
    }
}