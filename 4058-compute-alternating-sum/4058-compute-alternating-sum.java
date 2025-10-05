class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(i % 2 == 0) sum += num;
            else sum -= num;
        }
        return sum;
    }
}