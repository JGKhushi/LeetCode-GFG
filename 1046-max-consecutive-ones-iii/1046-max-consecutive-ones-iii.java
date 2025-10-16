class Solution {
    public int longestOnes(int[] nums, int k) {
        int start  = 0 , ans = 0  ;
        int n = nums.length;
        for(int i = 0 ; i< n ; i++){
            if(nums[i] == 0){
                
                if(k>0){
                   k--;
                }else{
                    while(start<n && nums[start] != 0){
                        start++;
                    } 
                    start++;
                }
            }

            ans = Math.max(ans , i-start+1);
        }
        return ans;
    }
}