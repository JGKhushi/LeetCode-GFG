class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hSet = new  HashSet<>();
        int n = nums.length;
        int res = 0;
        
        for(int i=0; i<n ;i++){
            hSet.add(nums[i]);
        }
        for(int value:hSet){
            int count = 0;
            if(hSet.contains(value) && !hSet.contains(value - 1)){
                while(hSet.contains(value)){
                    value++;
                    count++;
                }
            }
            res = Math.max(res , count);
        }

        return res;
    }
}