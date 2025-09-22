class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int maxF = 0 ;
        for(int i = 0 ; i< n ; i++){
            hmap.put(nums[i] , hmap.getOrDefault(nums[i] , 0) + 1);
            maxF = Math.max(maxF, hmap.get(nums[i]));
        }
        int count =  0 ;
        for(Map.Entry<Integer,Integer> e : hmap.entrySet()){
            if(maxF == e.getValue()){
                count++;
            }
        }
        return count * maxF;

    }
}