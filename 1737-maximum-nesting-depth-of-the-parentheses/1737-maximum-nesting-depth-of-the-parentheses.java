class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int open = 0 ;
        int ans = 0 ;
        int n = s.length();

        for(int i = 0 ; i< n ; i++){
            if(s.charAt(i) == '('){
                open++;
            }
            ans = Math.max(open ,ans);
            if(s.charAt(i) == ')'){
                open--;
            }
        }

        return ans;

    }
}