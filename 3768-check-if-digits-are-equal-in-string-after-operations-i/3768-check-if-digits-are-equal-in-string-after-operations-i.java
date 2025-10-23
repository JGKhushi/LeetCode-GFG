class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() != 2){
        int n = s.length();
            String ans = "";
        for(int i = 0 ; i< n-1 ; i++){
            int first = s.charAt(i) - '0';
            int second = s.charAt(i+1) - '0';
            int sum = first + second ;
            ans += sum % 10;
        }
        s = ans ;
        }
        if(s.charAt(0) == s.charAt(1))return true ;
        return false ;
    }
}