class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] ,  0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value % 2 != 0){
                return false;
            } 
        }

        return true;
    }
}