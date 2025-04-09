class Solution {
    public int minOperations(int[] nums, int k) {
       
        int n = nums.length;
        
           int ans = 0;
            HashSet<Integer> hset = new HashSet<>();
            for(int i = 0 ; i<n ; i++){
                hset.add(nums[i]);
            }
            for(int ele : hset ){
                if(ele < k){
                    return -1;
                }
                if(k != ele){
                    ans++;
                }
            }

            return ans;
        


    }
}