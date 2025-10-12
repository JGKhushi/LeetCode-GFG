class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0 ; 
        int high = n-1;

        if(nums[0] == target){
            return 0;
        }
        if(nums[n-1] == target){
            return n-1;
        }
        if( n>=2 && nums[1] == target ){
            return 1;
        }

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if((nums[mid] >= nums[low]) ){
                // left part is  sort
                if(target >= nums[low]  && nums[mid] >= target){
                    high = mid - 1 ;
                }
                else{
                    low = mid + 1;
                }
            }
            else{ // nums[mid] < nums[low])  right part is sorted
                 if( nums[high] >= target && nums[mid] <= target){
                   low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
               
            }
        }

        return -1;
    }
}