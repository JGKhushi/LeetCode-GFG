class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0 , 1);
        int count = 0 , sum = 0 ;
        for(int num : nums){
            sum += num ;
            count += hmap.getOrDefault(sum - goal , 0);
            hmap.put(sum , hmap.getOrDefault(sum,0 )+1);
        }
        return count ;
    }
}