class Solution {

    public int solve(int m , int n ,int[][] dp){
        if(m == 0 && n== 0){
            return 1 ;
        }
        
        if(dp[m][n] != -1 ){
            return dp[m][n];
        }
        int left = 0 ;
        int up = 0 ;
        if(n> 0){
            left =  solve(m , n-1 , dp);
        }
        if(m > 0){
            up = solve(m-1 , n , dp );
        }

        dp[m][n] =  left + up;

        return dp[m][n] ;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n] ;
        for(int i = 0 ; i <  m ; i++){
        Arrays.fill(dp[i] , -  1);
        }
        int ans = solve(m-1 , n-1 , dp );
        return ans ;
    }
}