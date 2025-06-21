class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length ;
        int sum = 0 ; int max = Integer.MIN_VALUE;
        if(k > n){
            return -1;
        }

        
        for(int i = 0 ; i< n ; i++){
            max = Math.max(nums[i] , max);
            sum += nums[i];
        }

        int low = max ; 
        int  high = sum ;
        
        while(low <= high ){
            int mid = (low + high)/2;
            int  num = 1 ;
            int last = 0;
            for(int i = 0 ; i< n ; i++){
            
                if(nums[i]+last <= mid){
                   
                    last += nums[i];
                }
                else{
                    num++;
                    last = nums[i];
                }
            }
            
            if(num <= k ){
                high= mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;

    }
}