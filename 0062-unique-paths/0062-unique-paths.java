class Solution {
    
    public int fn(int m , int n , int[][] dp , int i , int j  ){
        if(i == m || j == n ){
            return 0 ;
        }
        if(i == m-1 && j == n-1 ){
            return 1 ;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        //right
        int right =  fn(m , n , dp , i , j+1 );
        //down
        int down =  fn(m , n , dp , i+1 , j );

        return dp[i][j] = right + down ;
         
    }
    public int uniquePaths(int m, int n) {
        int count = 0 ;
        int dp[][] = new int[m][n] ;
        for(int i = 0 ;i<m;i++){
            Arrays.fill(dp[i] , -1);
        }
       int  ans = fn(m , n , dp ,  0 , 0) ;

        return ans ;
    }
}