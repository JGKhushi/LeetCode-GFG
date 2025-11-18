class Solution {

    public int uniquePaths(int m, int n) {
        int[] dp = new int[n] ;
       
        dp[0] = 1 ; 
       
        for(int i = 0 ; i <  m ; i++){
            int temp[] = new int[n] ;
            for(int j = 0 ; j< n ; j++){               
                int right = 0 ;
                int down = 0 ;
                if(j>0){
                right += temp[j-1] ; 
                }
                
                down += dp[j];
                

          
                temp[j] = right + down ;
            
           
            
            }

            dp = temp;

        }
        return  dp[n-1] ;
    }
}