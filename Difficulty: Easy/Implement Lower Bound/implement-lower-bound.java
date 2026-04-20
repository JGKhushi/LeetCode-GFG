class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        if( arr[n-1] < target){
            return n;
        }
        int left = 0 , right = n-1 ;
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] >= target){
                right = mid ;
            }else{
                left = mid + 1;
            }
        }
        
        
        return right ;
        
    }
}
