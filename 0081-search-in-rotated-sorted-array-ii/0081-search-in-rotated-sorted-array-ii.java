class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0 ;
         int high = n-1 ; 

         while(low <= high ){

        int mid = (low + high)/ 2 ;

        if(nums[mid] == target){
            return true;
        }
            if(nums[mid] >= nums[low]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid - 1;
                }else{
                    low = low + 1;
                }
            }else{
               if(target <= nums[high] && target >= nums[mid]){
                    low = mid + 1;
                }else{
                   high = high - 1; 
                } 
            }
         }

         return false;
    }
}