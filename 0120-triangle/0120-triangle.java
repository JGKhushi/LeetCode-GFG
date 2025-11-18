class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n =  triangle.size() ;
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(triangle.get(n-1));
        for(int i = n-2 ; i >= 0   ; i-- ){
           
            List<Integer> temp = new ArrayList<>();
            for(int j =0 ; j<triangle.get(i).size()  ; j++){
                 int ii =  triangle.get(i).get(j) + dp.get(dp.size() - 1).get(j);
                 int ip1 = triangle.get(i).get(j) + dp.get(dp.size() - 1).get(j+1);
                temp.add(Math.min(ii , ip1)) ;
            }
            dp.add(temp);
           
        }
        return dp.get(n-1).get(0);
    }
}

