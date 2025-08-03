class Solution {
    public static void fn(String s  , int n , List<String> ans , int open , int close){
        if(s.length() == n * 2 ){
            ans.add(s);
            return ;
        }

        if(open < n){
            fn(s + '(' , n , ans , open + 1 , close);
        }
        if(close < open ){
            fn(s + ')' , n , ans , open , close + 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        String  s = "";
        List<String> ans = new ArrayList<>();
        int open = 0, close = 0 ;
        fn(s , n , ans,open , close);
        return ans;
    }
}