class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int  n = nums1.length ;
         int  m = nums2.length ;
         int total = n + m ;
         int idx1 = total/2;
         int idx2 = total/2 - 1;
         int n1 = 0 ;
         int n2 = 0 ;
         int ans1 = 0 ;
         int ans2 = 0 ;
         int cnt = 0;

            while(n1 < n && n2 < m ){
                if(nums1[n1] < nums2[n2]){
                if(cnt == idx1 ) ans1 = nums1[n1];
                if(cnt == idx2) ans2 = nums1[n1];
                n1++;
                 cnt++;
            }
            else{
                if(cnt == idx1) ans1 = nums2[n2];
                if(cnt == idx2) ans2 = nums2[n2];
                n2++;
                 cnt++;
            }
           
            }
            
            while(n1 < n  ){
                 if(cnt == idx1 ) ans1 = nums1[n1];
                if(cnt == idx2) ans2 = nums1[n1];
                n1++;
                cnt++;
            }
            while(n2 < m ){
                 if(cnt == idx1 ) ans1 = nums2[n2];
                if(cnt == idx2) ans2 = nums2[n2];
                n2++;
                cnt++;
            }
         
         if(total % 2 == 0){
           return  (double)((double)(ans1 + ans2)) / 2.0 ;
         }
         else{
           return  (double)ans1;
         }

         

    }
}