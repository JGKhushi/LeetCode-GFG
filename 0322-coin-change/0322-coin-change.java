class Solution {

    public  int fn(int arr[] , int n , int T , int[][] dp){
        if(n == 0){
        if(T % arr[0] == 0){
            return T/arr[0];
        }
        else{
            return (int)Math.pow(10 , 9);
        }
        }


        if(dp[n][T] != -1){
            return  dp[n][T];
        }

        int notTake = fn(arr , n-1 , T , dp);
        int take =(int) Math.pow(10,9);
        if(arr[n] <= T){
            take = 1 + fn(arr , n , T -arr[n] ,dp);
        }

        return dp[n][T] = Math.min(notTake ,take);


    }
    public int coinChange(int[] arr, int T) {
        int n = arr.length;
        int dp[][] = new int[n][T+1];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        int ans = fn(arr , n - 1 , T , dp);

        if(ans >=  (int) Math.pow(10,9)) 
        return -1 ;
        
        return ans;

    }
}