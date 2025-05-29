import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int pref = 0;
        int ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum = 0 occurs once initially

        for (int i = 0; i < n; i++) {
            pref += nums[i];

            if (map.containsKey(pref - k)) {
                ans += map.get(pref - k);  // add frequency of (pref - k)
            }

            map.put(pref, map.getOrDefault(pref, 0) + 1);  // update prefix frequency
        }

        return ans;
    }
}
