class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[]  =  new int[n];
        int arr[] = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }

        for(int i = 0  ; i < n ; i++){
            int j = i ;
            while( (j < i+n ) && (nums[i] >= arr[j] ) ){
                j++;
            }
            if(j==n+i){
                ans[i] = -1;
            }else{
                ans[i] = arr[j];
            }
        }

        return ans;
    }
}