class Solution {
    public String removeOuterParentheses(String s) {
        
        int oc = 0 ;
        int cc = 0 ;
        int start = 0 ;
        int n = s.length();
        String  result = "";

        for(int i=0;i<n;i++){
        char c = s.charAt(i);

        if(s.charAt(i) == '('){
            oc++;
        }
        else if(s.charAt(i) == ')'){
            cc++;
        }

        if(oc == cc){
            result += s.substring(start+1 , i);
            start = i+1;

        }
        }

        return result.toString();
    }
}