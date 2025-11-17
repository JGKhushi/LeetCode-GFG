class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length ;
        int  first = -1 , cnt  = 0 ,second = -1 ;

        for(int i = 0 ; i< n ; i++){
            if(nums[i] == 1){
                cnt++;
                first = second ;
                second = i ;

            if(cnt >= 2){
                
               if( second - first - 1 < k ) {
                return false ;
               }
            }

            }
    
        }

       return true;
    }
}