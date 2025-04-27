class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<n;i++){
            //  if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
            //     stk.push(s.charAt(i));
            //  }
             if(!stk.isEmpty() && ((s.charAt(i) == ')' && stk.peek() == '(') || (s.charAt(i) == ']' && stk.peek() == '[') || (s.charAt(i) == '}' && stk.peek() == '{'))){
                stk.pop();
             }
             else{
                stk.push(s.charAt(i));
             }


        }

        if(stk.isEmpty()){
            return true;
        }
       
       return false;
    }
}