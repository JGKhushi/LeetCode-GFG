class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int res = 0 ; 
        int max = 0 ; 
        for(int i = 0 ; i< n ; i++){
            max = Math.max(nums[i] ,  max);
        }

        int low = 1 ; int high = max;
        int ans = 0;
        while(low <= high){

            res = 0 ;
            int mid = (low + high)/2 ;

            for(int i = 0 ; i< n ; i++){
                res += (int) Math.ceil((double) nums[i] / mid);
            }
            if(res > threshold){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }
}