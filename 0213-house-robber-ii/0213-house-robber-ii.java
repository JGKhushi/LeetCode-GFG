class Solution {

    public static int solve(int[] nums){
       int n = nums.length;
       int prev = nums[0];
       int prev2 = 0 ;

        for(int i = 1 ; i< n ;i++){
            int pick = nums[i];
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
        int n = nums.length;
     int arr1[] = new int[n];
     int arr2[] = new int[n];

     if(n==1){
        return nums[0];
     }

     for(int i = 0 ; i< n ; i++){
        if(i != 0 ) arr1[i]  = nums[i];
        if(i != n-1 ) arr2[i]  = nums[i];
     }

     int ans1 = solve(arr1);
     int ans2 = solve(arr2);


     return Math.max(ans1 , ans2);
    }
}