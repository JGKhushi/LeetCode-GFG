class Solution {
    public String longestCommonPrefix(String[] str) {
        int n =  str.length;
        int min = Integer.MAX_VALUE ;
        String check = "";
       for(int i = 0  ; i<n ; i++){
        if(str[i].length() < min ){
            check = str[i];
        }
        min = Math.min(min,str[i].length());
       }

       if(min == 0 || n == 0){
        return "";
       }
        String result = "";

       for(int i = 0 ; i< n ; i++){
            String ans = "";
        for(int j = 0 ; j<check.length() ; j++ ){
            if(check.charAt(j)== str[i].charAt(j)){
                ans += (check.charAt(j));
            } 
            else{
                break;
            } 
                    
        }
        check = ans;
       }

        return check;

    }
}