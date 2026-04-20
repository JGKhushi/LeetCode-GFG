class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int left = 0 , right = n ;
        while(left < right){
            int mid = left + (right - left)/2 ;
            if(arr[mid] > target){
                right = mid;
            }else{
                left = mid + 1 ;
            }
        }
        
        return right ;
    }
}
