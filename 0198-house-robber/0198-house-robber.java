class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev1 = nums[0];
        int prev2 = 0 ;
        for(int i = 1 ; i< n ; i++){
            int pick = nums[i];
            if(i > 1)pick += prev2 ;
            int notp = prev1;

            int curr = Math.max(pick , notp);
            prev2 = prev1;
            prev1 = curr;

        }
        return prev1;
    }
}