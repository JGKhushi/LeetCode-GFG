class Solution {

    private boolean isPalindrome(String s){
        int left = 0 , right = s.length() - 1;
        while(left < right ){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    private String toBaseK(long num , int k){
        StringBuilder sb = new StringBuilder();
        while(num > 0 ){
            sb.append(num % k);
            num  /= k;
        }
        return sb.toString();
    }

    public long kMirror(int k, int n) {
        long sum = 0 ;
        int length = 1 ;
        while(n>0){
            int halfLen = (length + 1)/ 2;
            long start = (long)Math.pow(10 , halfLen - 1);
            long end = (long)Math.pow(10 , halfLen ) - 1;

            for(long i  =start ; i<= end ; i++){
                String firstHalf = String.valueOf(i);
                StringBuilder secondHalf  = new StringBuilder(firstHalf).reverse();

                String palindromeStr= length % 2 == 0 ? firstHalf + secondHalf.toString() : firstHalf + secondHalf.substring(1);

                long palindromeNum = Long.parseLong(palindromeStr);

                if(isPalindrome(toBaseK(palindromeNum , k ))){
                    sum += palindromeNum ;
                    n--;
                    if(n == 0) return sum ;
                }
            }

            length++;
        }

        return sum;
    }
}