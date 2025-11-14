class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0  , high = n-1 ;
        int ans = n ;
        while(low < high ){
            int mid = low + (high - low) / 2 ; 
            if(nums[mid] >= target){
                ans = mid ;
                high = mid  ;
            }else{
                low = mid +1;
            }
        }

        if(low == n-1 && nums[n-1] < target)return low + 1;
        return low ; 
    }
}