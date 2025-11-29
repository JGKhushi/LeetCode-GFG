class Solution {

    public int fn(int[][]matrix , int[][]dp , int i , int j){
        int n = matrix.length ;
        if(i== n-1){
            return matrix[i][j];
        }

        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j] ;
        }
        int leftd = Integer.MAX_VALUE;
        int rightd = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        if(j>0)    leftd = fn(matrix , dp , i+1 , j-1);
        if(j<n-1)  rightd = fn(matrix , dp , i+1 , j+1);
        down = fn(matrix , dp , i+1 , j);
        
        dp[i][j] = Math.min(leftd , Math.min(rightd , down)) + matrix[i][j];
        return dp[i][j] ;
        
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int dp[][] = new int[n][n];

        for(int i = 0 ; i< n ; i++){
            Arrays.fill(dp[i] , Integer.MAX_VALUE );
        }

        int ans = Integer.MAX_VALUE ;

        for(int i=0 ;i<n ;i++ ){
            ans = Math.min(ans , fn(matrix , dp , 0 , i));
        }

        return ans ;
    }
}