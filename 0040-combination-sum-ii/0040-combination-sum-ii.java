class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>(); 
        Arrays.sort(candidates);
       List<List<Integer>> res = new ArrayList<>(); 
     fn(candidates , target ,  0 , temp , res);   
     return res;
    }
    public void fn(int[] candidates , int target ,   int start , List<Integer> temp 
    , List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(temp));
        }
        else if( target < 0 ){
            return ;
        }
        else
        {
        for(int i=start ; i<candidates.length;i++){
            if(i>start && candidates[i] == candidates[i-1]) continue;
        temp.add(candidates[i]);     
        fn(candidates , target - candidates[i] , i+1 , temp , res); 
        temp.remove(temp.size()-1) ; 
       }
    }
       
        
    }

}