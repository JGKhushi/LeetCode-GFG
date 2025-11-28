class Solution {

    public int fn(int n , int i , int cnt , int[] dp){
        if( i  == n ){
            return 1 ;
        }
        if(i > n){
            return 0 ;
        }

        if(dp[i] != -1){
            return dp[i] ;
        }
        //one step 
        int one = fn(n , i+1 , cnt , dp);
        //two step 
        int two = fn(n , i+2 , cnt  , dp);
        dp[i] = one + two ;
        return  dp[i] ;
    }

    public int climbStairs(int n) {
        int dp[] = new int[n] ;
        Arrays.fill(dp , - 1) ;
        int ans = fn(n , 0 , 0 ,dp);

        return ans ;




    }
}