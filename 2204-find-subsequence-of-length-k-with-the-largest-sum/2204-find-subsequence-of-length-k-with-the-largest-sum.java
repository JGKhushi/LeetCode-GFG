class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: Create array of (value, index) pairs
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];  // value
            pairs[i][1] = i;        // index
        }
        
        // Step 2: Sort based on value in descending order
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        
        // Step 3: Take top k elements and store their indices
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            indices.add(pairs[i][1]);
        }
        
        // Step 4: Sort indices to maintain original order
        Collections.sort(indices);
        
        // Step 5: Build result array using original indices
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[indices.get(i)];
        }
        
        return result;
    }
}
