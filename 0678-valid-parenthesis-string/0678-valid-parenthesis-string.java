class Solution {
    public boolean checkValidString(String s) {
        int maxOpen =  0 , minOpen = 0 ;
        int n = s.length() ;

        for(int i = 0 ; i< n ;i++){
            char c = s.charAt(i);
            if(c=='('){
                minOpen++;
                maxOpen++;
            }
            else if(c==')'){
                minOpen--;
                maxOpen--;
            }else{
                minOpen--;
                maxOpen++;
            }
            if(maxOpen < 0)return false ;
           
             minOpen =    Math.max(0, minOpen) ;
            
        }

        return minOpen == 0 ;
    }
}