class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long low = -100000L * 100000L; // -1e10
        long high = 100000L * 100000L; // +1e10

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (countPairs(nums1, nums2, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private long countPairs(int[] nums1, int[] nums2, long mid) {
        long count = 0;
        for (int a : nums1) {
            if (a >= 0) {
                // positive or zero
                count += countLessEqual(nums2, mid, a);
            } else {
                // a is negative ⇒ need to find count of nums2[j] ≥ ceil(mid / a)
                count += countGreaterEqual(nums2, mid, a);
            }
        }
        return count;
    }

    private long countLessEqual(int[] nums, long target, int a) {
        if (a == 0) {
            return target >= 0 ? nums.length : 0;
        }

        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            long product = 1L * a * nums[mid];
            if (product <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private long countGreaterEqual(int[] nums, long target, int a) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            long product = 1L * a * nums[mid];
            if (product <= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums.length - left;
    }
}
