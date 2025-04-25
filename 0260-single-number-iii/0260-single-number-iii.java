class Solution {
    public int[] singleNumber(int[] nums) {
        int hmm = 0;  // XOR of the two unique numbers
        for (int num : nums) {
            hmm ^= num;
        }

        // Get the rightmost set bit (differs between the two unique numbers)
        int fsb = hmm & -hmm;

        int[] ans = new int[2];
        for (int num : nums) {
            if ((num & fsb) == 0) {
                ans[0] ^= num;
            } else {
                ans[1] ^= num;
            }
        }

        return ans;
    }
}
