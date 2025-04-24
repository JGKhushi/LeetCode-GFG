import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);  // ✅ Sort to make pruning effective
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] arr, int target, int index, List<Integer> temp, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] > target) break;  // ✅ Prune the rest if current number > target

            temp.add(arr[i]);
            backtrack(arr, target - arr[i], i, temp, res);  // i, not i+1 because we can reuse
            temp.remove(temp.size() - 1); // Backtrack
        }
    }
}
