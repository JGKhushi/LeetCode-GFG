class Solution {
    public int totalFruit(int[] nums) {
        int n = nums.length;
        int ans = 0 ;
        int start = 0 ;
        HashMap<Integer,Integer>hmap = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            hmap.put(nums[i] , hmap.getOrDefault(nums[i] , 0)+1);
            if(hmap.size() > 2){
                while(hmap.size() != 2){
                    int val =  hmap.get(nums[start]);
                    val--;
                    if(val == 0){
                        hmap.remove(nums[start]);
                    }else{
                        hmap.put(nums[start] , val);
                    }
                    start++;
                }
            }
            ans = Math.max(ans , i-start+1);
        }

        return ans ;
    }
}