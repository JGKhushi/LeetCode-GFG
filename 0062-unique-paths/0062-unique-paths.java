class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n] ;
       
        dp[0][0] = 1 ; 
       
        for(int i = 0 ; i <  m ; i++){
            for(int j = 0 ; j< n ; j++){               
                int right = 0 ;
                int down = 0 ;
                if(j>0){
                right += dp[i][j-1] ; 
                }
                if(i > 0){
                down += dp[i-1][j];
                }

            if(i != 0 || j != 0){
                dp[i][j] = right + down ;
            }
           
            
            }

        }
        return  dp[m-1][n-1] ;
    }
}