class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n =  triangle.size() ;
        List<Integer> dp = new ArrayList<>();
        dp = triangle.get(n-1);
        for(int i = n-2 ; i >= 0   ; i-- ){
            List<Integer> temp = new ArrayList<>();
            for(int j =0 ; j<triangle.get(i).size()  ; j++){
                 int ii = triangle.get(i).get(j) + dp.get(j);
                 int ip1 = triangle.get(i).get(j) + dp.get(j+1);
                temp.add(Math.min(ii , ip1)) ;
            }
            dp=temp;
           
        }
        return dp.get(0);
    }
}