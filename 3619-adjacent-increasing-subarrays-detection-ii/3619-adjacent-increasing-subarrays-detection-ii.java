class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
     int n = nums.size();
     int k = 1 ; 
     int ans = 0 ;
     int prev = 0 ; 

     for(int i = 0 ; i<n-1 ; i++){
        if(nums.get(i) < nums.get(i+1) ){
            k++;
        }else{
            prev = k ;
            k= 1 ;
        }
        ans = Math.max(ans , Math.min(prev , k));
        ans = Math.max(ans , k / 2 );
     }   
     return ans ;
    }
}