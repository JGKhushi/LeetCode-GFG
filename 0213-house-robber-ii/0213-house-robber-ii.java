class Solution {
    public int fn(int[] nums ,int start , int end , int dp[] ){
             Arrays.fill(dp, 0);
             dp[start] = nums[start];
        if (start + 1 <= end) {
            dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        }
             for(int i = 2 ; i<= end ; i++){
                int notp = dp[i-1];
                int pick = nums[i] + dp[i-2];
                dp[i] = Math.max(pick , notp);
        }
        return dp[end];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        
         if(n==1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0] , nums[1]);
        }

        int ans1 = fn(nums ,0 , n-2 , dp );
        int ans2 = fn(nums ,1 , n-1 , dp);

        return Math.max(ans1 , ans2 );
    }
}