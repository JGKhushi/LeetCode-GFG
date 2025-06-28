class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        int[] temp = nums.clone(); // original array
        Arrays.sort(nums);

        // Step 1: Frequency map to count selected values
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = n - k; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Traverse original array and pick values in order using freq map
        int[] ans = new int[k];
        int idx = 0;

        for (int i = 0; i < temp.length; i++) {
            int val = temp[i];
            if (freq.containsKey(val) && freq.get(val) > 0) {
                ans[idx++] = val;
                freq.put(val, freq.get(val) - 1);
                if (idx == k) break;
            }
        }

        return ans;
    }
}
