import java.util.*;

class Solution {
    public static void fn(int[] nums, List<List<Integer>> lst, List<Integer> al, int i) {
        // add current subset (copy of al)
        lst.add(new ArrayList<>(al));

        // explore further elements
        for (int j = i; j < nums.length; j++) {
            // include nums[j]
            al.add(nums[j]);
            fn(nums, lst, al, j + 1);
            // backtrack (remove last element)
            al.remove(al.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        fn(nums, lst, new ArrayList<>(), 0);
        return lst;
    }
}
