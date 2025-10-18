import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        long last = Long.MIN_VALUE; // to handle large numbers safely

        for (int num : nums) {
            long low = (long) num - k;
            long high = (long) num + k;
            long assign = Math.max(low, last + 1);

            if (assign <= high) { // can assign a distinct number
                count++;
                last = assign; // update last assigned number
            }
        }

        return count;
    }
}
