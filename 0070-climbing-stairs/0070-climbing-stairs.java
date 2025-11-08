class Solution {
    public int fn(int n , int dp[] , int i ){
        if(i == n){
            return 1;
        }
        if(i > n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int first = fn(n , dp , i+1);
        int second = fn(n , dp , i+2);
        dp[i] = first +second ;
        return first + second ;
    }
    public int climbStairs(int n) {
        int dp[] = new int [n+1] ; 
        Arrays.fill(dp , -1);
        fn(n , dp , 0 );
        return dp[0];
    }
}