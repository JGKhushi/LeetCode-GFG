class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length , ans = 1 , prev = 0 , i =  1 ;
        while(i<n){
            if(nums[i] != nums[prev]){
                nums[ans++] = nums[i];
                
            }
                prev =  i++ ;
               
        }

        return ans ;
    }
}