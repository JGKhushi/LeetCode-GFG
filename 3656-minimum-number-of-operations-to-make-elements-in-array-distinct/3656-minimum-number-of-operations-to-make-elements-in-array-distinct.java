class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;

        while (true) {
            boolean hasDuplicate = false;

            // Check for duplicates in the current array of size 'n'
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        hasDuplicate = true;
                        break;
                    }
                }
                if (hasDuplicate) break;
            }

            // If no duplicates, break the loop
            if (!hasDuplicate) break;

            // Remove the first 3 elements
            int removeCount = Math.min(3, n);  // remove 3 or all remaining
            for (int i = 0; i < n - removeCount; i++) {
                nums[i] = nums[i + removeCount];  // shift left
            }
            n -= removeCount;
            count++;
        }

        return count;
    }
}
