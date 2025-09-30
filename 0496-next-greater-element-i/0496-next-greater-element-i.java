class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n  =  nums1.length;
        int m = nums2.length ;
        int ans[] = new int[n];
        for(int i = 0 ; i< n ; i++ ){
            int j = 0 ; 
            while(j<m && nums2[j] != nums1[i]){
                j++;
            }
            
            while(j<m && nums2[j] <= nums1[i]){
                j++;
            }
            if(j==m){
                ans[i] = -1 ;
                continue;
            }
            ans[i] = nums2[j] ;
            System.out.println();
        }

        return ans;
    }
}