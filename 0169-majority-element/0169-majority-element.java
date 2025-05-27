class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        int n = nums.length;
        for(int a : nums){
        if(count == 0 ){
            candidate = a ;
            count = 1;
        }
        else if(candidate == a){
            count++;
        }
        else{
            count--;
        }

        }

        count = 0;

        for(int a : nums){
            if(a == candidate){
                count++;
            }
        }

        if(count > n/2 ){
            return candidate;
        }

        return -1;
    }
}