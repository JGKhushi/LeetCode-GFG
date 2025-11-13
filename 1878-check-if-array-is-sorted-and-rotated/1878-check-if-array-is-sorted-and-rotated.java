class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int maxi = nums[0];
        int i = 0 ; 
            while(i<n-1 && nums[i] <= nums[i+1]){
                i++;
            }
            i++;
            while(i<n){
                if(nums[i]  > maxi  ){
                    return false ;
                }
                if(i < n - 1 && nums[i] > nums[i+1]){
                    return false ;
                }
                i++;
            }

        return true;
        
    }
}