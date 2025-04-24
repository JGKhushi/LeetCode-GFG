import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return new AbstractList<List<Integer>>(){
            List<List<Integer>> res = new ArrayList<>();
            private void backtrack(List<List<Integer>> res, List<Integer> cur, int target, int dep){
                if(target == 0){
                    res.add(new ArrayList<>(cur));
                    return;
                }

                for(int i = dep; i < candidates.length; i ++){
                    if(target >= candidates[i]){
                    cur.add(candidates[i]);
                    backtrack(res, cur, target - candidates[i], i);
                    cur.remove(cur.size() - 1);
                    }
                }
            }
            @Override
            public List<Integer> get(int index) {
                if (res.isEmpty()) backtrack(res, new ArrayList<>(), target, 0);
                return res.get(index);
            }

            @Override
            public int size() {
                if (res.isEmpty()) backtrack(res, new ArrayList<>(), target, 0);
                return res.size();
            }
        };
    }
}