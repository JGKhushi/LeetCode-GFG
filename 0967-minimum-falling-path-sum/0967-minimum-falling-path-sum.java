class Solution {

    public int  solve(int[][] dp ,int[][] matrix , int m , int n , int i  , int j ){
        if (j < 0 || j >= n) return Integer.MAX_VALUE;
        if(i == m-1){
            return matrix[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int dl =  solve(dp , matrix ,m , n, i+1 , j-1 );
        
        int down = solve(dp , matrix ,m , n,  i+1 , j);
     
        int dr = solve(dp , matrix ,m , n,  i+1 , j+1 );

        dp[i][j] = matrix[i][j] + Math.min(dl , Math.min(down , dr)) ;             
            
        return dp[i][j] ; 

    }

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int dp[][] = new int[m][n] ;

        for(int i =0 ; i < m ; i++){
            Arrays.fill(dp[i] , Integer.MAX_VALUE);
        }
        // int ans = Integer.MAX_VALUE     ;
        // for(int j = 0 ; j < n ; j++){
        //   ans = Math.min(solve(dp , matrix , m , n , 0  , j ) , ans ) ;
        // }

        for(int i = 0 ;i < n ; i++){
            dp[0][i] = matrix[0][i];
        }

        for(int i = 1 ; i < n  ; i++ ){
            for(int j =  0 ; j< n ; j++){
                int dl = Integer.MAX_VALUE ;
                int dr = Integer.MAX_VALUE ;
                int down = Integer.MAX_VALUE ;

                if(j>0)
                dl = dp[i-1][j-1] ;
                if(j<n-1)
                dr  = dp[i-1][j+1];

                down = dp[i-1][j] ;


                dp[i][j] = Math.min(dp[i][j] , matrix[i][j] + Math.min(dl , Math.min(down , dr))) ;                
            }
        }
        int ans = Integer.MAX_VALUE;
for (int j = 0; j < n; j++) {
    ans = Math.min(ans, dp[m-1][j]);
}
return ans;


    }
}