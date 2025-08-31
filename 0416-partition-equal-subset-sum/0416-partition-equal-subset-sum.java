class Solution {

    public static boolean fn(int n , int[] nums , int[][]dp , int k){
     if(n == 0 ){
        return nums[0] == k;
     }
     if(k == 0){
        return true;
     }

     if(dp[n][k] != -1){
        return dp[n][k] == 0 ? false : true;
     }

     boolean notTake = fn(n-1 , nums , dp , k);
    boolean take  = false;
     if(nums[n]  <= k){
     take = fn(n-1 , nums , dp , k - nums[n]);
     }

     dp[n][k] = take || notTake ? 1 : 0;

     return take||notTake;

    }
    public boolean canPartition(int[] nums) {
        int n = nums.length ; 

int sum = 0 ;    
for(int i = 0 ; i< n  ; i++){
    sum+= nums[i];
}

if(sum % 2 != 0){
    return false;
}

        int k= sum / 2;


        int dp[][] = new int[n][k+1];

    

        for(int i = 0  ; i< n ; i++){
            for(int j = 0  ; j<= k ; j++){
                dp[i][j] = -1;
            }
        }


boolean ans = fn(n - 1 , nums , dp ,  k);

return ans;

    }
}