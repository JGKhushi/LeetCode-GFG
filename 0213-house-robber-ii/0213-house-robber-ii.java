class Solution {
    public int fn(int[] nums){
        int n = nums.length;
       int prev1 = nums[0];
       int prev2 = 0;
       for(int i = 1 ; i<n ; i++){
            int pick = nums[i];
            if(i > 1) pick += prev2 ;

            int notpick = prev1;
            int curr = Math.max(pick , notpick);

            prev2 = prev1;
            prev1 = curr;

       }
            return prev1 ;
    }
    public int rob(int[] nums) {
        int n = nums.length;

        int nums1[] = new int[n];
        int nums2[] = new int[n];

        if(n== 1 )return nums[0];

        for(int i = 0 ; i< n ; i++){
            if(i != 0) nums1[i] = nums[i];
            if(i != n-1) nums2[i] = nums[i];
        }
        int ans1 = fn(nums1);
        int ans2 = fn(nums2);

        return Math.max(ans1 , ans2 );
    }
}