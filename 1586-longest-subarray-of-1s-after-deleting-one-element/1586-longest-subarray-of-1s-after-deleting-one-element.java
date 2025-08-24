class Solution {
    public int longestSubarray(int[] nums) {
        int z = 0;
        int ans = 0 ;
        int start   = 0;

        for(int i =0 ; i < nums.length ; i++){
            z += (nums[i] == 0 ? 1 : 0);
        

        while(z > 1){
            z -= (nums[start] == 0 ?  1 : 0);
            start++;
        }

        ans = Math.max(ans , i - start);
        }

        return ans;

    }


}  
