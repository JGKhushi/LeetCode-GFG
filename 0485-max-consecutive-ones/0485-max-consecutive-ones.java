class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length , ans= 0  , curr = 0;
        for(int i = 0 ; i<n ; i++ ){
            if(nums[i] == 1){
                curr++;
                ans  = Math.max(curr , ans);
            }else{
                curr = 0 ;
            }
        }

        return ans ;
    }
}