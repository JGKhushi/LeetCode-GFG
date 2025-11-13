class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length ;
        int sum = 0 , ans = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                ans = Math.max(ans , sum);
                sum = 0 ;
            }else{
                sum++;
            }
        }
        ans = Math.max(ans , sum);
        return ans;
    }
}