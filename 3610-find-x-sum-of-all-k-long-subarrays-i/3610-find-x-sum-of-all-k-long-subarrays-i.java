import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int[][] arr = new int[51][2];

            // Count frequency for current subarray
            for (int j = i; j < i + k; j++) {
                arr[nums[j]][1]++;  // frequency
                arr[nums[j]][0] = nums[j]; // value
            }

            // Sort based on frequency desc, then value desc
            Arrays.sort(arr, (a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1];
                return b[0] - a[0];
            });

            // Calculate x-sum
            int sum = 0;
            for (int j = 0; j < x && arr[j][1] > 0; j++) {
                sum += arr[j][0] * arr[j][1];
            }

            ans[i] = sum;
        }

        return ans;
    }
}
