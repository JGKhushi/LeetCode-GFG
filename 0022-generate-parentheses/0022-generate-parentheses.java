class Solution {

    public static void fn(int n , String s , List<String> ans , int open , int close){
        if(close > open || open > n || close > n  ){
            return ;
        }
       
        if(s.length() == n*2 && open == close){
            System.out.println(s);
            ans.add(s);
            return;
        }
        fn(n , s+'(' , ans , open+1 , close) ;
        fn(n , s+')' , ans , open , close+1) ;

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fn(n , "" , ans , 0 , 0);
        return ans ;
    }
}