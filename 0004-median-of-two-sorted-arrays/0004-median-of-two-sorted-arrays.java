class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int total = n + m;
        int mid = total / 2;

        int idx1 = 0, idx2 = 0;
        int cnt = 0;
        int curr = 0, prev = 0;

        while (cnt <= mid) {
            prev = curr;
            if (idx1 < n && (idx2 >= m || nums1[idx1] <= nums2[idx2])) {
                curr = nums1[idx1++];
            } else {
                curr = nums2[idx2++];
            }
            cnt++;
        }

        if (total % 2 == 0) {
            return (prev + curr) / 2.0;
        } else {
            return curr;
        }
    }
}
