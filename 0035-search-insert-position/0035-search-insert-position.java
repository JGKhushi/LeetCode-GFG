class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0 , high = n  ;

        if(nums[0] >= target) return 0 ;
        int ans = n;
        while(low < high ){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target){
                ans = mid ;
                System.out.println(ans);
                high = mid ;
            }else{
                low = mid + 1 ;
            }
        }
        return ans;
    }
}