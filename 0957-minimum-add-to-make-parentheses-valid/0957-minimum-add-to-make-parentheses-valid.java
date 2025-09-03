class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stk = new Stack<>();

        int n = s.length();
        
        for(int i = 0 ; i<n ; i++){
            if(!stk.isEmpty() && stk.peek() == '(' && s.charAt(i) == ')'){
                stk.pop();
            }
            
            else{
                stk.push(s.charAt(i));
            }
        }

    
        // for(int i = 0 ; i< stk.size() ; i++){
        //     char  c = stk.pop();
        //     if(c=='('){
        //         open++;
        //     }else{
        //         close++;
        //     }
        // }

        return stk.size();
    }
}