class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans[] = new int[n];
        for(int i=0 ; i<n ; i++ ){
            int j = 0 ;
            
            while(j<m && nums1[i] != nums2[j]){
                  j++;
            }
            boolean got = false;
              for(j = j+1 ; j<m ; j++){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    got = true;
                    break;
                }
              }

              if(!got){
                ans[i] = -1;
              }  
        }
        return ans;
    }
}