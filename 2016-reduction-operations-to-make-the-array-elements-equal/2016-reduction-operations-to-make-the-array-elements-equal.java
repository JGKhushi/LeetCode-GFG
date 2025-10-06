class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ops=0;
        int cnt=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                cnt++;
            }
            ops+=cnt;
        }    
        return ops;
    }

}