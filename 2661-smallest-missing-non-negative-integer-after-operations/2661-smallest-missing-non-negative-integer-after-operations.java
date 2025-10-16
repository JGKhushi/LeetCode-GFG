class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int n = nums.length;
        int mex = 0 ;
        for(int i= 0 ; i< n ; i++){
            if(nums[i] >= 0){
            hmap.put(nums[i]%value , hmap.getOrDefault(nums[i]%value , 0)+ 1);
            }
            else{
            hmap.put(((nums[i]%value)+value)%value , hmap.getOrDefault(((nums[i]%value)+value)%value , 0)+ 1);               
            }
        }
        int i = 0 ;
        while(true){
            if(!hmap.containsKey(i%value)){
               return i;
            }else{
                int val = hmap.get(i%value);
                val--;
                if(val == 0){
                    hmap.remove(i%value);
                }else{
                hmap.put(i%value,val);
                }
            }
            i++;
        }
       
    }
}