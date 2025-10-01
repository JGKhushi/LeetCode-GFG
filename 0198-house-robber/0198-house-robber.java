class Solution {
    public int rob(int[] nums) {
        int  n = nums.length ;
        if(n==2){
            return Math.max(nums[0] , nums[1]);
        }
        if(n==1){
            return nums[0];
        }
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);
        for(int i = 2 ; i< n ; i++ ){
            int notp = dp[i-1] ;
            int pick = Integer.MIN_VALUE;
            if( i> 1 ){
            pick = dp[i-2] + nums[i];
            }

            dp[i] = Math.max(pick , notp);
        }
        return dp[n-1];
    }
}