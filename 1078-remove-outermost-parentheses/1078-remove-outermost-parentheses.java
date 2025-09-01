class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        String ans = "";
        int n = s.length();
        int c = 0 ;
        for(int i= 0 ; i< n ; i++){
            if(s.charAt(i) == '('){
                if(stk.size() > 0){
                 ans = ans +s.charAt(i);
                }
                stk.push(s.charAt(i));
        
            }else{
               if(stk.size() > 1){
                
                 ans = ans +s.charAt(i);
                
               }
               stk.pop();
            }
        }


        return ans ;
    }
}