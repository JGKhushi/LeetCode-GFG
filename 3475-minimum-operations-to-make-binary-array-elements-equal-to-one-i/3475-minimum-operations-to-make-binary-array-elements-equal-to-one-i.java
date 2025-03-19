class Solution {
    public int minOperations(int[] nums) {
        int k = 3;
        int ans = 0;
        int n = nums.length;
        for(int i= 0 ; i<n-k+1 ; i++){
        if(nums[i] == 0){
            ans++;
             for(int j=0;j<k;j++){
               nums[j+i] = nums[j+i] ^ 1;
            }
        }
           
        }

        for(int i=0 ; i< k ; i++){
            if(nums[n-k+i] == 0){
                return  -1;
            }
        }
        

        return ans;
    }
}