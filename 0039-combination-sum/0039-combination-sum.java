class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort first
        List<List<Integer>> res = new ArrayList<>();
        fn(candidates, target, res, new ArrayList<>(), 0, 0);
        return res;
    }

    public void fn(int[] arr, int target, List<List<Integer>> res, List<Integer> temp, int sum, int i) {
        if (sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int j = i; j < arr.length; j++) {
            if (sum + arr[j] > target) break; // \U0001f525 Early stop
            temp.add(arr[j]);
            fn(arr, target, res, temp, sum + arr[j], j); // reuse current number
            temp.remove(temp.size() - 1); // backtrack
        }
    }
}
