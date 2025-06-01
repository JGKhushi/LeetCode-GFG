class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int low = 0 , high = n -1 ;
        while(low <= high){
            int mid  = (low + high)/2 ;

            if(nums[mid] == target){
                int i = mid;
                while(mid > -1 && nums[mid] == target){
                    mid--;
                }
                    ans[0] = mid + 1;
                    mid = i ;
                    while(mid < n && nums[mid] == target){
                    mid++;
                }
                ans[1 ] = mid - 1;

                break;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }


        return ans;
    }
}