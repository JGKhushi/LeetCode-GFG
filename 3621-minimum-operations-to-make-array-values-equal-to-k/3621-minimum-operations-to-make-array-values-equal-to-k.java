class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0] < k){
            return -1;
        }
        else{
           int ans = 0;
            HashSet<Integer> hset = new HashSet<>();
            for(int i = 0 ; i<n ; i++){
                hset.add(nums[i]);
            }
            for(int ele : hset ){
                if(k != ele){
                    ans++;
                }
            }

            return ans;
        }


    }
}