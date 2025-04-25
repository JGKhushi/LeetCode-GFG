import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[n - 1]; // Single number is at the end
    }
}
