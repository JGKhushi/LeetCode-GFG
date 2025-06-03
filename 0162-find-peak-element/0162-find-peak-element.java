// class Solution {
//     public int findPeakElement(int[] nums) {
//         int n = nums.length;
//         int low = 0 ;
//         int high = n - 1;
//         if(n == 1){
//             return 0;
//         }
//         if(n == 2){
//             return (nums[0]>nums[1] ? 0 : 1);
//         }
//         while(low <= high ){
//             int mid  = (low  + high)/ 2 ;
//             if(mid == 0 && nums[mid]>nums[mid + 1]){
//                 return 0;

//             }
//             else if(mid == n-1 && nums[mid]>nums[mid -1]){
//                 return n-1;
//             }
//             else if(nums[mid] > nums[mid - 1 ] && nums[mid]>nums[mid + 1]){
//                 return mid ;
//             }
//             else if (nums[mid] < nums[mid + 1 ]){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }

//         return 0;
//     }
// }

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        if (n == 1) return 0;
        if (n == 2) return (nums[0] > nums[1] ? 0 : 1);

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check boundaries
            if (mid == 0) {
                if (nums[mid] > nums[mid + 1]) return mid;
                else low = mid + 1;
            } else if (mid == n - 1) {
                if (nums[mid] > nums[mid - 1]) return mid;
                else high = mid - 1;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0; // fallback, though function should return inside loop
    }
}
