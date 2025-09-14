class Solution {

    public static void fn(int k , int n ,List<List<Integer>> ans , ArrayList<Integer>curr , int i  ){
        
        if(n == 0 && curr.size() == k ){
            ans.add(new ArrayList<>(curr) );
            return ;
        }

        for(int j= i ; j <= 9 ; j++ ){
         curr.add(j);
         fn(k , n - j , ans , curr , j+1);
         curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        fn(k , n ,ans , new ArrayList<>() , 1 );
        return ans ;
    }
}