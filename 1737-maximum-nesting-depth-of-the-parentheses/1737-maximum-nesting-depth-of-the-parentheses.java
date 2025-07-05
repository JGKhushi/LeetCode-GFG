class Solution {
    public int maxDepth(String s) {
        int ans = 0 ;
        int n = s.length();
        Stack<Character> stk = new Stack<>();
        int cnt = 0 ;
        for(int i = 0 ; i< n ; i++){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
                cnt++;
                ans = Math.max(cnt , ans);
            }
            else if(s.charAt(i) == ')'){
                stk.pop();
                cnt--;
            }
        }

        return ans;
    }
}