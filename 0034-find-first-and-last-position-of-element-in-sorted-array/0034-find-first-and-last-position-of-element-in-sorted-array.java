class Solution {

    public int first(int n , int nums[] , int target , int ans){
        int low = 0 , high = n -1 ;
        while(low <= high ){
            int mid =  low + (high - low) / 2 ;
            if(nums[mid] == target ){
                ans = mid;
                high = mid-1 ;
            }else if(nums[mid] < target){
                low  = mid + 1 ;
            }else{
                high = mid - 1 ;
            }
        }

        return ans;
    }
    public int last(int n , int nums[] , int target , int ans){
        int low = 0 , high = n -1 ;
        while(low <= high ){
            int mid =  low + (high - low) / 2 ;
            if(nums[mid] == target ){
                ans = mid;
                low = mid+1 ;
            }else if(nums[mid] < target){
                low  = mid + 1 ;
            }else{
                high = mid - 1 ;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];
        arr[0] = -1 ; arr[1]= -1;
        arr[0] = first(n , nums , target , -1);
        arr[1] = last(n , nums , target , -1);
     
        return arr;
    }
}