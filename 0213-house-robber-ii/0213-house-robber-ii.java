// class Solution {

//     public int fn(int dp[] , int arr[] , int i ){
//         int n = arr.length ;
//         // if(i >= n ){
//             return 0 ;
//         }
        
//         if(dp[i] == -1){
//             return dp[i];
//         }

//         int pick = arr[i] + fn(dp , arr , i+2);
//         int npick = fn(dp , arr, i+1 );
        
//         int total = Math.max(pick , npick);
//         dp[i] = Math.max(dp[i] , total );

//         return total ;
//     }

//     public int rob(int[] nums) {
//         int n = nums.length ; 
//         int[] dp = new int[n+1];
//         Arrays.fill(dp , -1);
//          int arr1[] = new int [n];
//          int arr2[] = new int [n];
//          for(int i = 0 ; i< n  ; i++){
//             if(i != 0 ){
//                 arr1[i] = nums[i];
//             }
//             if(i != n-1){
//                 arr2[i] = nums[i];
//             }
//          }

//         int ans = Math.max(fn(dp , arr1 , 0 ) , fn(dp ,arr2 , 1 )) ;

//         return ans ;
//     }
// }

class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // arr1: include 0, exclude last
        int[] arr1 = new int[n];
        // arr2: exclude 0, include last
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            if (i != n - 1) arr1[i] = nums[i];  // last nahi lenge
            if (i != 0) arr2[i] = nums[i];      // first nahi lenge
        }

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = fn(dp1, arr1, 0);
        int case2 = fn(dp2, arr2, 1);

        return Math.max(case1, case2);
    }

    // Linear robber function
    public int fn(int[] dp, int[] nums, int i) {
        int n = nums.length;

        if (i >= n) return 0;
        if (dp[i] != -1) return dp[i];

        // if nums[i] == 0 means empty spot (excluded house)
        int take = nums[i] + fn(dp, nums, i + 2);
        int skip = fn(dp, nums, i + 1);

        return dp[i] = Math.max(take, skip);
    }
}
