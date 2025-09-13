class Solution {

    public static void fn(int[] candidates , int target , List<List<Integer>> arr , List<Integer> curr ,  int i   ){
        int n = candidates.length;
        if(i == n ){
            return ; 
        }    
       
        if(target == 0  ){
           arr.add(new ArrayList<>(curr));
           return ;
        }

        if(target < 0 ){
            return ; 
        }

        // pick till it doesn't exceeds 
        curr.add(candidates[i]);
        fn(candidates , target - candidates[i]  , arr , curr , i);
        
//if it exceeds then we have to backtrack by removing one by one elements
        curr.remove(curr.size() - 1);
        fn(candidates , target , arr , curr , i+1 );

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> arr = new ArrayList<>();

       Arrays.sort(candidates);
        
       fn( candidates , target , arr , new ArrayList<Integer>(),  0);

       return arr;

       
    }
}