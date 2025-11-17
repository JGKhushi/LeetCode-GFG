class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length ;
        int  first = -1 , cnt  = 0 ,second = -1 ;
        int dist =Integer.MAX_VALUE;

        for(int i = 0 ; i< n ; i++){
            if(nums[i] == 1){
                cnt++;
                first = second ;
                second = i ;

            if(cnt >= 2){
               dist = Math.min(dist , second - first - 1 ) ;
            }
            System.out.println(first + " i" + i + " dist" + dist + " " + second) ;
            }
    
        }

        if(dist >= k){
            return true;
        }

       return false ;
    }
}