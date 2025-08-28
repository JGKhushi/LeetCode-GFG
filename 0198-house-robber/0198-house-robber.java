class Solution {

    public static int solve(int[] nums){
       int n = nums.length;
       int prev = nums[0];
       int prev2 = 0 ;

        for(int i = 1 ; i< n ;i++){
            int pick = nums[i] ;
            if(i>1){
                pick += prev2;
            }
                int nonpick = 0+ prev;
                int cur_i = Math.max(pick , nonpick);
                prev2 = prev ;
                prev = cur_i;
        } 

        return prev;
    }
    public int rob(int[] nums) {
     return solve(nums);
    }
}