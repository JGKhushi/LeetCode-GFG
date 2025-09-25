class Solution {

    public static int fn(int i , int j , List<List<Integer>> triangle , int[][] dp){
        int n = triangle.size();
        if(i == n-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j] != Integer.MAX_VALUE){return dp[i][j];}

        int down = fn(i+1 , j , triangle , dp);
        int diag = fn(i+1 , j+1 , triangle , dp);

        dp[i][j] = triangle.get(i).get(j) + Math.min(down , diag);
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
     int n = triangle.size();
     int dp[][] = new int[n][n]; 
     for(int i =  0 ; i< n ; i++){
        for(int j = 0 ; j< n ; j++){
            dp[i][j] = Integer.MAX_VALUE;
        }
     } 
     return fn(0,0,triangle,dp); 
    }
}