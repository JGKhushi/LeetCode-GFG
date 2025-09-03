class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int sI = 0 ;
        int maxi = 0;
        for(int i = 0 ; i< n ; i++){
            if(nums[i] == 1){
                sI = i ;
            while(i<n && nums[i] == 1){
                i++;
            }
                maxi = Math.max(maxi , i - sI );
            }
        }


        return maxi;
    }
}