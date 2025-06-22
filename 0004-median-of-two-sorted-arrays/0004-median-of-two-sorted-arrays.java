// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n = nums1.length ;
//         int m = nums2.length;

//         int ans = 0;
//         int mid = (n+m)/2 + 1;
        
        
//         int idx1 = 0 ;
//         int idx2 =0 ;
//         int cnt = 0 ; 
        



//         for(int i = 0 ; i< mid ; i++){
            
//             if((idx1 < n && idx2 < m) && (nums1[idx1]>nums2[idx2])){
//                 if((n+m)%2 == 0 && (cnt == mid-1 || cnt == mid-2) ){
//                     ans+= nums2[idx2];
//                 }

//                 if((n+m)% 2 != 0 && cnt == mid){
//                     return nums2[idx2];
//                 }
//                 idx2++;
//             }else{
//                 if((idx1 < n && idx2 < m) ){
//                     if((n+m)%2 == 0 && (cnt == mid-1 || cnt == mid-2) ){
               
//                     ans+= nums1[idx1];
//                 }
//              if((n+m)% 2 != 0 && cnt == mid){
//                     return nums1[idx1];
//                 }
//                 idx1++;
//                 }
                
//             }

//             cnt++;
//         }

//        return (double)ans/2;

//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int total = n + m;
        int mid = total / 2;

        int idx1 = 0, idx2 = 0;
        int cnt = 0;
        int curr = 0, prev = 0;

        while (cnt <= mid) {
            prev = curr;
            if (idx1 < n && (idx2 >= m || nums1[idx1] <= nums2[idx2])) {
                curr = nums1[idx1++];
            } else {
                curr = nums2[idx2++];
            }
            cnt++;
        }

        if (total % 2 == 0) {
            return (prev + curr) / 2.0;
        } else {
            return curr;
        }
    }
}
