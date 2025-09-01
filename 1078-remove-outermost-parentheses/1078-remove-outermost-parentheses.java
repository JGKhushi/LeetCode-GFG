class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int n = s.length();
        int o = 0 ;
        for(int i= 0 ; i< n ; i++){
            if(s.charAt(i) == '('){
                o++;
                if(o > 1){
                 ans = ans +s.charAt(i);
                }        
            }else{
               if(o > 1){
                
                 ans = ans +s.charAt(i);
                
               }
               o--;
            }
        }


        return ans ;
    }
}