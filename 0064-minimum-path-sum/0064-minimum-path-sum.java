class Solution {

    public int solve(int[][] grid ,int[][] dp , int m , int n  , int sum){
        if(m == 0 && n== 0){
            return grid[0][0] ;
        }
        
        if(dp[m][n] != Integer.MAX_VALUE){
            return  dp[m][n];
        }

        int left = Integer.MAX_VALUE ;
        int up = Integer.MAX_VALUE ;
        if(n > 0 ){
            left = grid[m][n] + solve(grid , dp , m , n - 1 , sum);
        }
        if(m > 0){
           up  = grid[m][n] +  solve(grid , dp , m-1 , n , sum);
        }


        dp[m][n] = Math.min(left ,up);

        return dp[m][n] ;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        for(int i  = 0 ; i < m ; i++){
            Arrays.fill(dp[i] , Integer.MAX_VALUE) ;
        }
        // int ans = solve(grid , dp , m -1, n-1 , 0 );
        // return ans ;

        for(int i = 0 ; i  < m ; i++){
            for(int j =0 ; j <n ; j++ ){
                if(i == 0 && j == 0 ){
                    dp[i][j] = grid[0][0];
                    continue ;
                }

                int left = Integer.MAX_VALUE ;
                int up = Integer.MAX_VALUE;

                if(i > 0 ){
                    left = grid[i][j] + dp[i-1][j] ;
                }
                if(j > 0 ){
                    up = grid[i][j] + dp[i][j-1] ;
                }

                dp[i][j] = Math.min(left , up);


            }
        }

        return dp[m-1][n-1];

    }
}