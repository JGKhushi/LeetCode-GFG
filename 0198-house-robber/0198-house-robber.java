class Solution {

    public int fn(int[] nums , int[] dp , int i   ){
        int n = nums.length;
        if(i >= n ){
            return 0 ;
        }

        if(dp[i] != -1){
            return dp[i] ;
        }

        int pick = nums[i] + fn(nums , dp , i + 2);

        int npick =  fn(nums , dp , i+1);

        dp[i] = Math.max(pick , npick) ;

        return dp[i] ; 
    }

    public int rob(int[] nums) {
        int n = nums.length ;
        int dp[] = new int[n] ;

        Arrays.fill(dp , -1);
        // int ans = fn(nums , dp , 0 ) ;

        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0] , nums[1]);
        }
        dp[n-1]  = nums[n-1];
        dp[n-2] = Math.max(nums[n-1] , nums[n-2]); 
        for(int i = n-3 ; i>= 0 ; i--){
            int pick =  nums[i] + dp[i+2];
            int npick = dp[i+1] ; 
            dp[i] = Math.max(pick , npick);
        }
        return dp[0] ;
    }
}