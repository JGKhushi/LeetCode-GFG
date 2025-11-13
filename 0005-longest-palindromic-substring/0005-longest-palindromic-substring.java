class Solution {
    public String longestPalindrome(String s) {
        int sI = 0 ;
         int n = s.length();
         int maxLen = 0 ;

         for(int i = 0 ; i< n  ; i++){
            for(int j = 0 ; j< n ; j++){
                int l = i ; 
                int r = j ;

                while( l <= r ){
                    if(s.charAt(l) != s.charAt(r)){
                        break;
                    }
                    l++;
                    r--;
                }

                if( l>=r && j - i  + 1 > maxLen){
                    maxLen = j- i + 1 ;
                    sI = i ;
                }
            }
         }

         return s.substring(sI , sI + maxLen);
    }
}