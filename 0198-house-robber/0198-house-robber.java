class Solution {

    public int fn(int nums[] , int n , int[] dp ,  int i   ){
       if(i >= n){
        return 0 ;
       }
     
       if(dp[i] != -1){
         return dp[i] ;
       }

       int npick =  fn(nums , n , dp , i+1);
       int pick =    nums[i] + fn(nums , n , dp , i+2 );


        dp[i] =  Math.max(npick , pick);

        return dp[i];
    }

    public int rob(int[] nums) {
       int n = nums.length;
       if(n==1)return nums[0];

       int dp[] = new int[n+1] ;
        Arrays.fill(dp , -1);

        int ans =  fn(nums ,  n  ,dp , 0 ) ;

        return ans;
     

    }
}