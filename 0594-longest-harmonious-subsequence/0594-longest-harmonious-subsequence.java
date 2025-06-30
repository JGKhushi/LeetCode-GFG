class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start = 0 ; int end = 1 ;
        int ans = 0 ;
        int n = nums.length;
        while(end<n){
            if(nums[end] - nums[start] > 1){
                start++;
            }
            
             if(nums[end] - nums[start] == 1){
              ans = Math.max(ans ,end - start + 1);
            }
            
            

            end++;
        }

        return ans;
    }
}