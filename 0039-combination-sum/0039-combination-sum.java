class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        fn(candidates, target, res, new ArrayList<>(), 0, 0);
        return res;
    }

    public void fn(int[] arr, int target, List<List<Integer>> res, List<Integer> temp, int sum, int i) {
        // Base Case 1: If sum equals target, add the current combination to result
        if (sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // Base Case 2: If sum exceeds target or index is out of bounds, stop recursion
        if (sum > target || i == arr.length) {
            return;
        }

        // Include the current number (arr[i])
        temp.add(arr[i]);
        fn(arr, target, res, temp, sum + arr[i], i); // Not i+1 because we can reuse the same number
        temp.remove(temp.size() - 1); // Backtrack

        // Skip the current number and move to the next
        fn(arr, target, res, temp, sum, i + 1);
    }
}
