class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int sI = 0 ;


        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int l = i ;
                int r = j ; 
                while(l<= r ){
                    if(s.charAt(l) != s.charAt(r)){
                        break;
                    }
                    l++;
                    r--;
                }

                if(l>r && j-i + 1 > maxLen){
                    sI = i ;
                    maxLen = j - i + 1;
                }

               
            }
        }

        return s.substring(sI , sI + maxLen);
    }
}
